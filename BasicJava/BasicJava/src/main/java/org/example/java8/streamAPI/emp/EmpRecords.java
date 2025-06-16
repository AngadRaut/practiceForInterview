package org.example.java8.streamAPI.emp;

import java.util.Arrays;
import java.util.List;

public class EmpRecords {
    public static List<Employee> empList(){
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", "HR", "Female", 55000.0, 28),
                new Employee(102, "Bob", "IT", "Male", 70000.0, 30),
                new Employee(103, "Charlie", "Finance", "Male", 67000.0, 32),
                new Employee(104, "Diana", "IT", "Female", 72000.0, 27),
                new Employee(105, "Ethan", "Sales", "Male", 60000.0, 29),
                new Employee(106, "Fiona", "Marketing", "Female", 58000.0, 26),
                new Employee(107, "George", "Finance", "Male", 64000.0, 33),
                new Employee(108, "Hannah", "HR", "Female", 53000.0, 31),
                new Employee(109, "Ian", "IT", "Male", 75000.0, 34),
                new Employee(110, "Jasmine", "Marketing", "Female", 59000.0, 25),
                new Employee(111, "Kevin", "Sales", "Male", 62000.0, 30),
                new Employee(112, "Laura", "HR", "Female", 56000.0, 28),
                new Employee(113, "Michael", "IT", "Male", 80000.0, 35),
                new Employee(114, "Nina", "Finance", "Female", 66000.0, 32),
                new Employee(115, "Oscar", "Sales", "Male", 61000.0, 27)
        );
        return employees;
    }
    public static void main(String[] args) {

    }
}