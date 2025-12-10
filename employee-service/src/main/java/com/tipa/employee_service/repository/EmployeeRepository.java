package com.tipa.employee_service.repository;

import com.tipa.employee_service.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

