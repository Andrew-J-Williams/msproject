package com.msproject.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproject.department.entity.Department;
import com.msproject.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department") // We include this as our base path when making REST calls.
@Slf4j // This annotation adds a logger to our class.
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/") // This request will help save our department to the repository.
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}
	
}
