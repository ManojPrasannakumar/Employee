package com.example.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		Scanner sc = new Scanner(System.in);
		/*List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee((long) 232323,"Manoj","HP"));
		emp.add(new Employee((long) 300000,"Kumar","Dell"));
		emp.add(new Employee((long) 111111,"Arjun","Mac Book"));
		emp.add(new Employee((long) 543446,"Kevin","HP-note"));
		emp.add(new Employee((long) 342431,"Angel","iMac"));
		*/
		/*
		 * for(Employee e:emp) { System.out.println(e.getlaptopName()); }
		 */
		
		//System.out.println("Enter the Employee id to be searched");
		//Long empid = Long.parseLong(sc.nextLine());
	    
		//System.out.println(getLaptopDetails(emp,empid));
		
	}
	
	static String getLaptopDetails(List<Employee> emp, Long id) {
		for(Employee e:emp) {		
		if(e.getId()==id)
			return e.getlaptopName();
		}
		return "Employee doesnt exist";
	}
}
