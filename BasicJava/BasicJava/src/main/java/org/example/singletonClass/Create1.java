package org.example.singletonClass;

import java.io.Serializable;

// Singleton class with thread safety, clone prevention, and serialization protection
public class Create1 implements Cloneable, Serializable {
    // volatile keyword insures that changes in instance are visible to all threads
    private static volatile Create1 singleton;
    // private constructor to prevent direct instantiation
    private Create1(){
        // Prevents instance creation via reflection if instance already exists
        if (singleton != null){
            throw new RuntimeException("Use getInstance() for this singleton class!!");
        }
    }
    // Double-checked locking for thread-safe and efficient singleton creation
    public static Create1 getInstance(){
        if (singleton == null){   // first check no locking
            synchronized (Create1.class){
                if (singleton == null){   // 2nd check with locking
                    singleton = new Create1();
                }
            }
        }
        return singleton;
    }
    // prevent cloning of this singleton class
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Not Supported!!");
    }
    // Ensures that deserialization does not create a new instance
    private Object readResolve(){
        return singleton;
    }
}

class Check{
    public static void main(String[] args) {
        Create1 obj1 = Create1.getInstance();
        Create1 obj2 = Create1.getInstance();
        System.out.println(obj1==obj2);     // true
    }
}