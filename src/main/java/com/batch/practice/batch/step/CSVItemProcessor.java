package com.batch.practice.batch.step;

import com.batch.practice.batch.entity.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class CSVItemProcessor implements ItemProcessor<Employee, Employee> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

    public CSVItemProcessor() {
        DEPT_NAMES.put("1", "HR");
        DEPT_NAMES.put("2", "IT");
        DEPT_NAMES.put("3", "FINANCE");
    }

    @Override
    public Employee process(Employee employee) throws Exception {
        String deptCode = employee.getDept();
        String dept = DEPT_NAMES.get(deptCode); // 1 . HR
        employee.setDept(dept); // HR
        employee.setTime(new Date()); // creation Time
        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
        return employee;
    }
}
