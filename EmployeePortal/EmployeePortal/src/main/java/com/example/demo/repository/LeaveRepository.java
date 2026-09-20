package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LeaveRequest;

public interface LeaveRepository extends JpaRepository<LeaveRequest, Integer> {

}
