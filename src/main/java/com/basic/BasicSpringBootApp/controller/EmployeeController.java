package com.basic.BasicSpringBootApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.BasicSpringBootApp.Employee;
import com.basic.BasicSpringBootApp.repo.EmployeeRepo;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	 private final EmployeeRepo repo;

	    public EmployeeController(EmployeeRepo repo) {
	        this.repo = repo;
	    }
	    
	    @GetMapping("/all")
	    public List<Employee> getAll() {
	    	return repo.findAll();
	    }
	    
	    @PostMapping
	    public Employee create(@RequestBody Employee employee) {
	    	return repo.save(employee);
	    }
	    
	    @GetMapping("/{id})")
	    public Employee getById(@PathVariable Long id) {
			return repo.findById(id).orElseThrow();
	    	
	    }
	    
	    @DeleteMapping("/{id}")
	    public void deleteById(@PathVariable Long id) {
	    	 repo.deleteById(id);
	    }

	        

}
