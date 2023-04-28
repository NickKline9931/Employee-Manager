package com.example.initial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.initial.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}