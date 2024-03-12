package com.pj;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private EmployeeRepository repo;
	
	
	public EmployeeService(EmployeeRepository repo) {this.repo = repo;}
	
	public Employee saveEmployee(Employee employee) {return repo.save(employee);}
	
	public List<Employee> getAllEmployee() {return repo.findAll();}
	
	public void deleteEmployeeById(Integer id) {repo.deleteById(id);}
}
