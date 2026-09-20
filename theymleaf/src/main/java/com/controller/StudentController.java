package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.Student;
@Controller
public class StudentController {
    @GetMapping("/")
    public String home(Model model) {

        Student student = new Student(
                101,
                "Sriman",
                "Computer Science",
                "sriman@gmail.com"
        );
        model.addAttribute("student", student);
        return "home";
    }
}