package com.msproject.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproject.department.entity.Department;
import com.msproject.department.service.DepartmentService;

@RestController
@RequestMapping("/department") // We include this as our base path when making REST calls.
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	public Department saveDepartment(Department department) {
		return departmentService.saveDepartment(department);
	}
	
}
