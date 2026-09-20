package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	Employee save(Employee employee);

	Employee update(Employee employee);

	void delete(Integer id);

	Employee getById(Integer id);

	List<Employee> getAll();

}