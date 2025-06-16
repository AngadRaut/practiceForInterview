package org.example.java8.streamAPI.emp;

import java.util.List;

public class MaxMinAge {
    public static void main(String[] args) {
        List<Employee> records = EmpRecords.empList();
        Employee employee = records.stream().max((a, b) -> (a.getAge() - b.getAge())).get();
        System.out.println(employee);

    }
}
