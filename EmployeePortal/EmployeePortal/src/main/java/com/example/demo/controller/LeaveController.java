package com.example.demo.controller;

import java.time.temporal.ChronoUnit;

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

import com.example.demo.entity.Employee;
import com.example.demo.entity.LeaveRequest;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.LeaveService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/leaves")
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getAllLeaves(Model model) {
        model.addAttribute("leaves", leaveService.getAll());
        return "leaveList";
    }

    @GetMapping("/apply")
    public String leaveForm(Model model) {
        model.addAttribute("leave", new LeaveRequest());
        model.addAttribute("employees", employeeService.getAll());
        return "leaveForm";
    }

    @PostMapping("/save")
    public String saveLeave(@RequestParam Integer employeeId,
                            @Valid @ModelAttribute("leave") LeaveRequest leave,
                            BindingResult result,
                            Model model) {
        if (leave.getFromDate() != null && leave.getToDate() != null
                && leave.getFromDate().isAfter(leave.getToDate())) {
            result.rejectValue("toDate", "date.invalid", "To date must be after from date");
        }

        if (result.hasErrors()) {
            model.addAttribute("employees", employeeService.getAll());
            return "leaveForm";
        }

        Employee employee = employeeService.getById(employeeId);
        if (employee == null) {
            return "redirect:/leaves/apply";
        }

        leave.setEmployee(employee);
        leave.setTotalDays((int) ChronoUnit.DAYS.between(leave.getFromDate(), leave.getToDate()) + 1);
        leave.setStatus("PENDING");
        leaveService.save(leave);
        return "redirect:/leaves";
    }

    @GetMapping("/approve/{id}")
    public String approveLeave(@PathVariable Integer id) {
        LeaveRequest leave = leaveService.getById(id);
        if (leave != null) {
            leave.setStatus("APPROVED");
            leaveService.update(leave);
        }
        return "redirect:/leaves";
    }

    @GetMapping("/reject/{id}")
    public String rejectLeave(@PathVariable Integer id) {
        LeaveRequest leave = leaveService.getById(id);
        if (leave != null) {
            leave.setStatus("REJECTED");
            leaveService.update(leave);
        }
        return "redirect:/leaves";
    }

    @GetMapping("/delete/{id}")
    public String deleteLeave(@PathVariable Integer id) {
        leaveService.delete(id);
        return "redirect:/leaves";
    }
}
