package com.msproject.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproject.department.repository.DepartmentRepository;

@Service // We include this annotation with every service class
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
}
