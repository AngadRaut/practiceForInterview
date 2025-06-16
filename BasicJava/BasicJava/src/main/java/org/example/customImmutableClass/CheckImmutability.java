package org.example.customImmutableClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckImmutability {
    public static void main(String[] args) throws CloneNotSupportedException {
        // create the address
        Address address = new Address("street 1", "city X");

        // phone no
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("123456");
        phoneNumbers.add("456789");

        // meta data
        Map<String, String> metadata = new HashMap<>();
        metadata.put("hobby", "Watching Movies");

        // Declare the employee
        Employee e = new Employee("John", 23, address, phoneNumbers, metadata);
        System.out.println("Employee::"+e);

        // Update details
        e.getPhoneNumbers().add("345123");
        e.getMetadata().put("skill", "Java");
        e.getMetadata().put("designation", "HR");

        System.out.println("After updating list and map :");
        System.out.println(e.getPhoneNumbers());
        System.out.println(e.getMetadata());
        System.out.println("Employee::"+e);


        // i am trying to change address fields
        e.getAddress().setCity("pune");
        e.getAddress().setStreet("shivane");
        System.out.println(e);
    }
}
