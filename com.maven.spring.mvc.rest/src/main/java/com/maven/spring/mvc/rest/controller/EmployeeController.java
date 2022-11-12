package com.maven.spring.mvc.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.maven.spring.mvc.rest.entity.Employee;
import com.maven.spring.mvc.rest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee e = employeeService.getEmployee(id);
		return e;
	}
}
