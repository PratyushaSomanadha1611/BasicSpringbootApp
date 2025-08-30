package com.basic.BasicSpringBootApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basic.BasicSpringBootApp.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
