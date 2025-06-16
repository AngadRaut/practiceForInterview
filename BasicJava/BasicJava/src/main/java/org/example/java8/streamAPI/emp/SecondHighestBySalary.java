package org.example.java8.streamAPI.emp;

import java.util.List;

public class SecondHighestBySalary {
    public static void main(String[] args) {
        List<Employee> employees = EmpRecords.empList();
        employees.stream().sorted((a,b)-> (int) -(a.getSalary()-b.getSalary())).skip(1).limit(1).forEach(System.out::print);
    }
}