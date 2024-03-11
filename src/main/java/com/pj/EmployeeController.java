package com.pj;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private EmployeeService service;
	
	public EmployeeController(EmployeeService service) {this.service=service;}
	
	
    public Employee saveEmployee(Employee employee) {return service.saveEmployee(employee);}
	
	public List<Employee> getAllEmployee() {return service.getAllEmployee();}
	
	public void deleteEmployee(Integer id) {service.deleteEmployeeById(id);}
	
	
}
