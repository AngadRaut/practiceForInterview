package org.example.customImmutableClass;

import java.util.*;

public final class Employee {
    private final String empName;
    private final int age;
    private final Address address;
    private final List<String> phoneNumbers;
    private final Map<String, String> metadata;

    public Employee(String empName, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata) {
        this.empName = empName;
        this.age = age;
        this.address = address;
        this.phoneNumbers = new ArrayList<>(phoneNumbers);
        this.metadata = new HashMap<>(metadata);
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

  /*  public List<String> getPhoneNumbers() {
        return phoneNumbers;
        }

    public Map<String, String> getMetadata() {
        return metadata;
    }
    */

    public List<String> getPhoneNumbers() {
        return new ArrayList<>();
    }

    public Map<String, String> getMetadata() {
        return new HashMap<>();
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", metadata=" + metadata +
                '}';
    }
}
