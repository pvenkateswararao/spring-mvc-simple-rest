package com.maven.spring.mvc.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.maven.spring.mvc.rest"})
public class ApplicationConfig {

	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate j = new JdbcTemplate(dataSource());
		System.out.println("JDBC Bean created");
		return j;
	}
	
	@Bean("dataSource")
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_rest?useSSL=false");
		dataSource.setUsername("hbstudent");
		dataSource.setPassword("hbstudent");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	}
}
