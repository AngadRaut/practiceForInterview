package org.example.singletonClass.breakSingleton;

import java.io.*;

public class BreakUsingDeserialization {
    public static void main(String[] args) {
        try{
            Create3 obj = Create3.getInstance();
            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(obj);
            out.close();
            fos.close();
            System.out.println("serialization complete!!\ndeserialization starts!!!");

            FileInputStream fis = new FileInputStream("file.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            Create3 obj1 = (Create3)  is.readObject();
            fis.close();
            is.close();
            System.out.println("deserialization complete");
            System.out.println("check objects starts!!");
            System.out.println(obj == obj1);
            System.out.println(obj.hashCode()+":"+obj1.hashCode());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

 class Create3 implements Serializable {
    // create private static field
    private static Create3 instance;
    // create all constructors as private
    private Create3(){

    }
    // create static method with return the object
    public static Create3 getInstance(){
        if(instance == null){
            instance = new Create3();
        }
        return instance;
    }
    // its an custom method we have to add in singleton class so during deserialization
     // we will not get the different object Without readResolve(), deserialization will create a new instance, breaking Singleton, Enum, or caching guarantees.
   // The readResolve() method is defined by the developer inside a class that implements Serializable.
     //
     //It is not inherited from any superclass but is recognized by the Java Serialization mechanism at runtime.
   /* private Object readResolve(){
        return instance;
    }*/
}
