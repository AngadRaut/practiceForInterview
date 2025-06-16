package org.example.serialization;

import java.io.*;

public class Externalization implements Externalizable {
   transient int age;
   static String name;
    String password;


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

    @Override
    public String toString() {
        return "Externalization{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Externalization ex = new Externalization();
        ex.setAge(100);
        ex.setName("nana");
        ex.setPassword("bhanu");

        try {
            System.out.println("Before Serialization"+ex);

            // serialization
            FileOutputStream fos = new FileOutputStream("abc.file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ex);
            System.out.println(" Serialization completed");

            // deserialization
            FileInputStream fin = new FileInputStream("abc.file");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Externalization externalization = (Externalization) ois.readObject();
            System.out.println("deserialization completed");
            System.out.println("after deserialization "+externalization);

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
        out.writeObject(name);
        out.writeObject(password);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         age = in.readInt();
         name = (String) in.readObject();
         password = (String) in.readObject();
    }
}
