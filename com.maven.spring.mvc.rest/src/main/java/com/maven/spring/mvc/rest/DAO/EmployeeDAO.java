package com.maven.spring.mvc.rest.DAO;

import com.maven.spring.mvc.rest.entity.Employee;

public interface EmployeeDAO {

	public Employee findEmployeeById(int id);
}
