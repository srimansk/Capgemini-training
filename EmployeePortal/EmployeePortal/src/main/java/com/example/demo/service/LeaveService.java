package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.LeaveRequest;

public interface LeaveService {

	LeaveRequest save(LeaveRequest leave);

	LeaveRequest update(LeaveRequest leave);

	void delete(Integer id);

	LeaveRequest getById(Integer id);

	List<LeaveRequest> getAll();

}