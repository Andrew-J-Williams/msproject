package com.msproject.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Whenever we create a class within an entity, we always use '@Entity' to indicate this class is an entity.
public class Department {
	
	@Id // Sets 'departmentId' as the primary key...
	@GeneratedValue(strategy = GenerationType.AUTO) // ...and automatically generates a value for each instance of the class.
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
