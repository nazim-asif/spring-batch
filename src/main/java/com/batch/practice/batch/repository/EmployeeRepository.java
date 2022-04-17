
package com.batch.practice.batch.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.batch.practice.batch.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
