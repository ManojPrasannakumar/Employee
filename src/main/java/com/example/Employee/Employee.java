package com.example.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	private @Id Long id;
	private String name;
	private String laptopName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlaptopName() {
		return laptopName;
	}
	public void setlaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", "
				+ "laptopName=" + laptopName + "]";
	}
	
	public Employee() {}

	public Employee(Long id, String name, String laptopName) {
		super();
		this.id = id;
		this.name = name;
		this.laptopName = laptopName;
	}

	
}
