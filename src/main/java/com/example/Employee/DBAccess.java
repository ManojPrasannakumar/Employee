package com.example.Employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.core.ConsoleAppender;


@Configuration
public class DBAccess {
	
	//ConsoleAppender<Employee> log = new ConsoleAppender<>();
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {

	    return args -> {
	    	repository.save(new Employee(111111l,"Tom Merchant","HP"));
	    	repository.save(new Employee(343434l,"Arjun Kumar","Dell"));
	    	repository.save(new Employee(562311l,"Steve","Mac-Book"));
	    	repository.save(new Employee(232356l,"Manoj","HP-Note"));
	    	repository.save(new Employee(444444l,"Varun","iMac"));
	    	
	    	//log.addInfo("Laptop Name");
	    };
	  }
}
