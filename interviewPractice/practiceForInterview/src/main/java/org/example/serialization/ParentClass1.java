package org.example.serialization;

import java.io.*;

public class ParentClass1 implements Serializable{
    int age;
    String name;

    public ParentClass1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ParentClass1() {
    }

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

class ChildClass1 extends ParentClass1  {
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
        ChildClass1 childClass = new ChildClass1();
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
            ChildClass1 childClass1 = (ChildClass1) ois.readObject();
            System.out.println("deserialization completed");
            System.out.println("after serialization "+childClass1);
            System.out.println(childClass1.getAge());
            System.out.println(childClass1.getName());

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public ChildClass1(int age, String name, String address, String mobileNo, Integer rollNo) {
        super(age, name);
        this.address = address;
        this.mobileNo = mobileNo;
        this.rollNo = rollNo;
    }


    public ChildClass1(){

    }

    public ChildClass1(String address, String mobileNo, Integer rollNo) {
        this.address = address;
        this.mobileNo = mobileNo;
        this.rollNo = rollNo;
    }
}
