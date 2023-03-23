package edu.eci.cvds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.eci.cvds.springbootjpa.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
