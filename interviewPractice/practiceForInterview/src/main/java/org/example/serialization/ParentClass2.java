package org.example.serialization;

import java.io.*;

public class ParentClass2 {
    int age;
    String name;

    public ParentClass2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ParentClass2() {
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

class ChildClass2 implements Serializable  {
    String address;
    String mobileNo;
    Integer rollNo;
    ParentClass2 p=new ParentClass2(20,"angad");

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
                '}';
    }

    public static void main(String[] args) {
        ChildClass2 childClass = new ChildClass2();
        childClass.setRollNo(1000);
        childClass.setMobileNo("1234567890");
        childClass.setAddress("Pune");

          ParentClass2 p2 = new ParentClass2();
        p2.setAge(100);
        p2.setName("nana");


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
            ChildClass2 childClass1 = (ChildClass2) ois.readObject();
            System.out.println("deserialization completed");
            System.out.println("after serialization "+childClass1);


        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public ChildClass2( int age, String name, String address, String mobileNo, Integer rollNo) {
        this.address = address;
        this.mobileNo = mobileNo;
        this.rollNo = rollNo;
    }


    public ChildClass2(){

    }

    public ChildClass2(String address, String mobileNo, Integer rollNo) {
        this.address = address;
        this.mobileNo = mobileNo;
        this.rollNo = rollNo;
    }
}
