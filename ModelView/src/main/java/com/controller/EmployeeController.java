package com.controller;
import com.example.Address;
import com.example.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class EmployeeController {
    @GetMapping({"/", "/employee"})
    public String showEmployeeForm(Model model) {
        Employee employee = new Employee();
        employee.setAddress(new Address());
        model.addAttribute("employee", employee);
        return "EmployeeView";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(
            @ModelAttribute("employee") Employee employee,
            Model model
    ) {
        model.addAttribute("emp", employee);
        return "success";
    }
}