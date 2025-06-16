package org.example.collections.list.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindEmpHaving10thHighestSalary {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();

        empList.add(new Emp(25, "Alice", 50000));
        empList.add(new Emp(30, "Bob", 60000));
        empList.add(new Emp(28, "Charlie", 55000));
        empList.add(new Emp(35, "David", 70000));
        empList.add(new Emp(40, "Eva", 75000));
        empList.add(new Emp(29, "Frank", 58000));
        empList.add(new Emp(32, "Grace", 62000));
        empList.add(new Emp(45, "Hannah", 80000));
        empList.add(new Emp(27, "Ian", 53000));
        empList.add(new Emp(38, "Jane", 72000));

        System.out.println("Original list : "+empList);
       /* Double v = empList.stream().map(emp -> emp.getSalary()).sorted().limit(9).findFirst().get();
        System.out.println(v);*/
        Emp emp = empList.stream().sorted(Comparator.comparingDouble(Emp::getSalary)).limit(9).findFirst().get();
        System.out.println(emp);
    }
}
