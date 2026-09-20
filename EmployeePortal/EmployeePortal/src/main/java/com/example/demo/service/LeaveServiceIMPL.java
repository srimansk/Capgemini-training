package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LeaveRequest;
import com.example.demo.repository.LeaveRepository;

@Service
public class LeaveServiceIMPL implements LeaveService {

	@Autowired
	private LeaveRepository repository;

	@Override
	public LeaveRequest save(LeaveRequest leave) {
		return repository.save(leave);
	}

	@Override
	public LeaveRequest update(LeaveRequest leave) {
		return repository.save(leave);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public LeaveRequest getById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<LeaveRequest> getAll() {
		return repository.findAll();
	}

}