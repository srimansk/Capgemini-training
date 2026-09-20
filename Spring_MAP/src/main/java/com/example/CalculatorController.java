package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String add(
            @RequestParam("a") int a,@RequestParam("b") int b) {
        return "Addition = " + (a + b);
    }
    @GetMapping("/sub")
    public String subtract(
            @RequestParam("a") int a,@RequestParam("b") int b) {
        return "Subtraction = " + (a - b);
    }
    @GetMapping("/mul")
    public String multiply(
            @RequestParam("a") int a,@RequestParam("b") int b) {

        return "Multiplication = " + (a * b);
    }
    @GetMapping("/div")
    public String divide(
            @RequestParam("a") int a,@RequestParam("b") int b) {
        return "Division = " + (a / b);
    }
}