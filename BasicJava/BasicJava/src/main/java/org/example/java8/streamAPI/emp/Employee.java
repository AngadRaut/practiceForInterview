package org.example.java8.streamAPI.emp;

public class Employee {
    private Integer empId;
    private String name;
    private String department;
    private String gender;
    private Double salary;
    private Integer age;

    public Employee() {
    }

    public Employee(Integer empId, String name, String department, String gender, Double salary, Integer age) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
