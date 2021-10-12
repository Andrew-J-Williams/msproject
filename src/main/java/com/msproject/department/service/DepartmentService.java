package com.msproject.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproject.department.entity.Department;
import com.msproject.department.repository.DepartmentRepository;

@Service // We include this annotation with every service class
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// We copied this method from the controller to the service class, modifying the return object as the repository 
		
		return departmentRepository.save(department);
	}
	
}
