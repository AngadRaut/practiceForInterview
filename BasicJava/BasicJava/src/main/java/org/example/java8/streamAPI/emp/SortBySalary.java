package org.example.java8.streamAPI.emp;

import java.util.Comparator;
import java.util.List;

public class SortBySalary {
    public static void main(String[] args) {
        // 2. Sort the List of Employee objects based on salary in Ascending order
        List<Employee> employees = EmpRecords.empList();
        List<Double> ascOrder = employees.stream().map(Employee::getSalary).sorted().toList();
        System.out.println("Sorted by ascending salary :"+ascOrder);

        // desc order
        List<Double> descOrder = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();
        System.out.println("\nSorted by ascending salary :"+descOrder);
    }
}
