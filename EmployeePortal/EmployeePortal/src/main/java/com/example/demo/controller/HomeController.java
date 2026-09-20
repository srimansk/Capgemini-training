package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.AssetService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.LeaveService;

@Controller
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private LeaveService leaveService;

    @Autowired
    private AssetService assetService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("employeeCount", employeeService.getAll().size());
        model.addAttribute("leaveCount", leaveService.getAll().size());
        model.addAttribute("assetCount", assetService.getAll().size());
        return "dashboard";
    }
}
