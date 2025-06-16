package org.example.java8.streamAPI.emp;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalEmp
{
    public static void main(String[] args) {
        List<Employee> employees = EmpRecords.empList();
        // find the total no of emp
        long count = employees.stream().count();
        System.out.println("Total emp count : "+count);
        // find no of male emp and store them in list
        List<Employee> male = employees.stream().filter(emp -> emp.getGender().equals("Male")).toList();
        System.out.println("Total male emp : "+male.size()+"\nList of male emp\n"+male+"\n");

        // find no of female emp and count them
        // find no of female emp and store them in list
        List<Employee> female = employees.stream().filter(emp -> emp.getGender().equals("Female")).toList();
        System.out.println("Total Female emp : "+female.size()+"\nList of Female emp\n"+female+"\n");

        // find it using groupingBy
        Map<String, List<Employee>> collect =
                employees.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(collect);

    }
}
