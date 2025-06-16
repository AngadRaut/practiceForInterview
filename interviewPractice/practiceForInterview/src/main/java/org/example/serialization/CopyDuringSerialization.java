package org.example.serialization;

import java.io.*;

public class CopyDuringSerialization {
    public static void main(String[] args) {
        Employee employee = new Employee("nana",11,new Salary(123.12));
        Employee employee1 = employee;
        System.out.println(employee1.getSalary());

        Employee externalization = null;
        try {
            System.out.println("Before Serialization"+employee);

            // serialization
            FileOutputStream fos = new FileOutputStream("abc.file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            System.out.println(" Serialization completed");

            // deserialization
            FileInputStream fin = new FileInputStream("abc.file");
            ObjectInputStream ois = new ObjectInputStream(fin);
             externalization = (Employee) ois.readObject();
            System.out.println("deserialization completed");
            System.out.println("after deserialization "+externalization);

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        employee.setSalary(new Salary(88575.00));
        System.out.println(employee1.getSalary());
        System.out.println(employee.getSalary());

        System.out.println("\n\n\nemployee == employee1: " + (employee == employee1)); // should be true
        System.out.println("employee == externalization: " + (employee == externalization)); // should be false

        System.out.println("employee.getSalary() == externalization.getSalary(): " +
                (employee.getSalary() == externalization.getSalary())); // should be false for deep copy

        System.out.println(employee.getSalary());
        System.out.println(externalization.getSalary());

    }
}

class Salary implements Serializable{
    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }

    public Salary(double salary) {
        this.salary = salary;
    }

    public Salary() {
    }
}

 class Employee implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;
    private Salary salary;

    public Employee(String name, int id, Salary salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Salary getSalary() { return salary; }
    public void setSalary(Salary salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + '}';
    }
}