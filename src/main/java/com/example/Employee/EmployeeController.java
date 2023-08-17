package com.example.Employee;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private final EmployeeRepository repository;

	EmployeeController(EmployeeRepository repository) {
		
		this.repository = repository;
	}
  
	@GetMapping("/employees")
	List<Employee> all() {
		return repository.findAll();
	}
  
	@GetMapping("/employees/{id}")
	String laptopDetails(@PathVariable Long id) {
		if(repository.getById(id).getId()==id) {
			return repository.getReferenceById(id).getlaptopName();
		} else {
			try {
				throw new EmployeeNotFoundException(id);
			} catch (Exception e) {
				return "Employee doesnt exist"+e;
			}
		}
		
	}	
}