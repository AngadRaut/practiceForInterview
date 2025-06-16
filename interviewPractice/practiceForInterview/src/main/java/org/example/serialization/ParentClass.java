package org.example.serialization;

import java.io.*;

public class ParentClass {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class ChildClass extends ParentClass implements Serializable {
    String address;
    String mobileNo;
    Integer rollNo;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.setName("nana");
        childClass.setAge(11);
        childClass.setRollNo(1000);
        childClass.setMobileNo("1234567890");
        childClass.setAddress("Pune");


        try {
            System.out.println("Before Serialization"+childClass);

            // serialization
            FileOutputStream fos = new FileOutputStream("abc.file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(childClass);
            System.out.println(" Serialization completed");

            // deserialization
            FileInputStream fin = new FileInputStream("abc.file");
            ObjectInputStream ois = new ObjectInputStream(fin);
            ChildClass childClass1 = (ChildClass) ois.readObject();
            System.out.println("\ndeserialization completed");
            System.out.println("after serialization "+childClass1);
            System.out.println(childClass1.getAge());


        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
