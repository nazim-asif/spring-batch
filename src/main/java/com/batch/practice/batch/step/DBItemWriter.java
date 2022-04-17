
package com.batch.practice.batch.step;

import com.batch.practice.batch.entity.Employee;
import com.batch.practice.batch.repository.EmployeeRepository;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBItemWriter implements ItemWriter<Employee> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(List<? extends Employee> emplyees) throws Exception {

        System.out.println("Data Saved for Employees: " + emplyees);
        employeeRepository.saveAll(emplyees);
    }
}
