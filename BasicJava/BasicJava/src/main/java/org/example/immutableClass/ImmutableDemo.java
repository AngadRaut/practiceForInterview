package org.example.immutableClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ImmutableDemo {
    public static void main(String[] args) {
        Address address = new Address("street 1", "city X");
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("123456");
        phoneNumbers.add("456789");
        Map<String, String> metadata = new HashMap<>();
        metadata.put("hobby", "Watching Movies");
// Declare the employee
        Employee e = new Employee("John", 23, address, phoneNumbers, metadata);
        System.out.println("\nbefore adding\n"+e+"\n");
// Update details
        e.getPhoneNumbers().add("345123");
        e.getMetadata().put("skill", "Java");
        e.getMetadata().put("designation", "HR");

        System.out.println(e.getPhoneNumbers());
        System.out.println(e.getMetadata());
    // now try to remove details
        e.getMetadata().remove("hobby");
        e.getPhoneNumbers().remove("123456");

        System.out.println(e.getPhoneNumbers());
        System.out.println(e.getMetadata());
    }
}

final class Employee {
    private final String empName;
    private final int age;
    private final Address address;
    private final List<String> phoneNumbers;
    private final Map<String, String> metadata;

    public Employee(String name, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata) {
        super();
        this.empName = name;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.metadata = metadata;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

  /*  public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }*/
    public List<String> getPhoneNumbers(){
        return new ArrayList<>(phoneNumbers);
    }
    public Map<String,String> getMetadata(){
        return new HashMap<>(metadata);
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

final class Address implements Cloneable{

    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "{Street: " + street + ", City: " + city + "}";
    }

}
