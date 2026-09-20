package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.AssetRequest;
import com.example.demo.entity.Employee;
import com.example.demo.service.AssetService;
import com.example.demo.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/assets")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getAllAssets(Model model) {
        model.addAttribute("assets", assetService.getAll());
        return "assetList";
    }

    @GetMapping("/request")
    public String assetForm(Model model) {
        AssetRequest asset = new AssetRequest();
        asset.setRequestDate(LocalDate.now());
        asset.setQuantity(1);
        model.addAttribute("asset", asset);
        model.addAttribute("employees", employeeService.getAll());
        return "assetForm";
    }

    @PostMapping("/save")
    public String saveAsset(@RequestParam Integer employeeId,
                            @Valid @ModelAttribute("asset") AssetRequest asset,
                            BindingResult result,
                            Model model) {
        if (result.hasErrors()) {
            model.addAttribute("employees", employeeService.getAll());
            return "assetForm";
        }

        Employee employee = employeeService.getById(employeeId);
        if (employee == null) {
            return "redirect:/assets/request";
        }

        asset.setEmployee(employee);
        asset.setStatus("PENDING");
        assetService.save(asset);
        return "redirect:/assets";
    }

    @GetMapping("/approve/{id}")
    public String approveAsset(@PathVariable Integer id) {
        AssetRequest asset = assetService.getById(id);
        if (asset != null) {
            asset.setStatus("APPROVED");
            assetService.update(asset);
        }
        return "redirect:/assets";
    }

    @GetMapping("/reject/{id}")
    public String rejectAsset(@PathVariable Integer id) {
        AssetRequest asset = assetService.getById(id);
        if (asset != null) {
            asset.setStatus("REJECTED");
            assetService.update(asset);
        }
        return "redirect:/assets";
    }

    @GetMapping("/deliver/{id}")
    public String deliverAsset(@PathVariable Integer id) {
        AssetRequest asset = assetService.getById(id);
        if (asset != null) {
            asset.setStatus("DELIVERED");
            assetService.update(asset);
        }
        return "redirect:/assets";
    }

    @GetMapping("/delete/{id}")
    public String deleteAsset(@PathVariable Integer id) {
        assetService.delete(id);
        return "redirect:/assets";
    }
}
