package edu.eci.cvds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.eci.cvds.springbootjpa.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
