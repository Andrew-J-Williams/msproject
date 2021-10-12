package com.msproject.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproject.department.entity.Department;
import com.msproject.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service // We include this annotation with every service class
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// We copied this method from the controller to the service class, modifying the return object as the repository 
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}
	
}
