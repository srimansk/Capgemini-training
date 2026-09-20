package com.example;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	@GetMapping
	public String getAllStudents() {
		return "get all students";
		
	}
	@PostMapping
	public String addStudent(@RequestBody Student student) {
		return "Student added";
	}
	@GetMapping("/{id}")
	public String getStudent(@PathVariable("id") int id) {
		return "Student retrived";
	}
	@PutMapping("/{id}")
	public String updateStudent(@PathVariable("id") int id,@RequestBody Student student) {
		return "Student updated";
	}
	@DeleteMapping("/{id}") 
	public String deleteStudent(@PathVariable("id") int id) {
		return "Student id " + id + " deleted";
	}
	@PatchMapping("/{id}")
	public String updateStudentEmail(@PathVariable("id") int id,@RequestParam("email") String email) {
		return "Student " + id + " email updated to " + email;
	}
	
}
