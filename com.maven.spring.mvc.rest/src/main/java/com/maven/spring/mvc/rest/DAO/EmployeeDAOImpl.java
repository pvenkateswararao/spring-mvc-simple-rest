package com.maven.spring.mvc.rest.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maven.spring.mvc.rest.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Employee findEmployeeById(int id) {
		
		String sql = "Select * from Employee where id=?";
		Object[] params = { id };
		Employee e=jdbcTemplate.queryForObject(sql, params, new BeanPropertyRowMapper<Employee>(Employee.class));
		
		return e;
	}

}
