package com.maven.spring.mvc.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.spring.mvc.rest.DAO.EmployeeDAO;
import com.maven.spring.mvc.rest.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	public Employee getEmployee(int id) {
		return employeeDAO.findEmployeeById(id);
	}
}
