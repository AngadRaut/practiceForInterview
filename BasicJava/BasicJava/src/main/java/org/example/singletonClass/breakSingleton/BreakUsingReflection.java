package org.example.singletonClass.breakSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakUsingReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Create4 obj = Create4.getInstance();
        Constructor<Create4> constructor = Create4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Create4 obj2 = constructor.newInstance();
        System.out.println(obj == obj2);
        System.out.println(obj.hashCode()+":"+obj2.hashCode());
    }
}

class Create4 {
    // create pri vate static field
    private static Create4 instance;
    // create all constructors as private
    /*private Create4(){

    }*/
    // for breaking because of reflection throw exception in constructor
    private Create4(){
       /* if (instance != null){
            throw new RuntimeException("Use getInstance()!!");
        }*/
    }
    // create static method with return the object
    public static Create4 getInstance(){
        if(instance == null){
            instance = new Create4();
        }
        return instance;
    }

}