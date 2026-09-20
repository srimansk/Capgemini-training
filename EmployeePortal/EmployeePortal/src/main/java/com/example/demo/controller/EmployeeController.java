package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", service.getAll());
        return "employees";
    }

    @GetMapping("/add")
    public String addEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeForm";
    }

    @PostMapping("/save")
    public String saveEmployee(@Valid @ModelAttribute Employee employee,
                               BindingResult result) {
        if (result.hasErrors()) {
            return "employeeForm";
        }
        service.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("/{id}")
    public String getEmployee(@PathVariable Integer id, Model model) {
        Employee employee = service.getById(id);
        if (employee == null) {
            return "redirect:/employees";
        }
        model.addAttribute("employee", employee);
        return "employeeProfile";
    }

    @GetMapping("/edit/{id}")
    public String editEmployeeForm(@PathVariable Integer id, Model model) {
        Employee employee = service.getById(id);
        if (employee == null) {
            return "redirect:/employees";
        }
        model.addAttribute("employee", employee);
        return "employeeEdit";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable Integer id,
                                 @Valid @ModelAttribute Employee employee,
                                 BindingResult result) {
        if (result.hasErrors()) {
            employee.setId(id);
            return "employeeEdit";
        }
        employee.setId(id);
        service.update(employee);
        return "redirect:/employees/" + id;
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        service.delete(id);
        return "redirect:/employees";
    }
}
