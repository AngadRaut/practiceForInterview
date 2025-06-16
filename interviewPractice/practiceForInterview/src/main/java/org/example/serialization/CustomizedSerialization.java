package org.example.serialization;

import java.io.*;

public class CustomizedSerialization implements Serializable{
    int age;
    String name;
    transient String password;

    @Override
    public String toString() {
        return "CustomizedSerialization{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void writeObject(ObjectOutputStream outputStream) throws Exception{
        outputStream.defaultWriteObject();
        String epwd = "123"+password;
        outputStream.writeObject(epwd);
    }
    private void readObject(ObjectInputStream inputStream) throws Exception{
        inputStream.defaultReadObject();
        String string = (String) inputStream.readObject();
        password = string.substring(3);
    }

    public static void main(String[] args) {

        CustomizedSerialization cs = new CustomizedSerialization();
        cs.setAge(100);
        cs.setName("nana");
        cs.setPassword("NANA");
        try {
            System.out.println("Before Serialization"+cs);

            // serialization
            FileOutputStream fos = new FileOutputStream("abc.file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cs);
            System.out.println(" Serialization completed");

            // deserialization
            FileInputStream fin = new FileInputStream("abc.file");
            ObjectInputStream ois = new ObjectInputStream(fin);
            CustomizedSerialization customizedSerialization = (CustomizedSerialization) ois.readObject();
            System.out.println("deserialization completed");
            System.out.println("after serialization "+customizedSerialization);


        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
