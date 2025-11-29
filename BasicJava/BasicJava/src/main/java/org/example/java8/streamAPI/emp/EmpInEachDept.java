package org.example.java8.streamAPI.emp;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpInEachDept {
    public static void main(String[] args) {
        List<Employee> employees =
                EmpRecords.empList();
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect);

        // find the name of all departments
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
    }
}