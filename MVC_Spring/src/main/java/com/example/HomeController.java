package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
@RequestMapping("/")
public String home() {
	return "index";
}

@GetMapping("/products")
public String products1() {
	return "ViewProducts";
}

@GetMapping("/products/id=101")
public String products(@RequestParam int id,Model model) {
	return "ViewProducts";
}


}