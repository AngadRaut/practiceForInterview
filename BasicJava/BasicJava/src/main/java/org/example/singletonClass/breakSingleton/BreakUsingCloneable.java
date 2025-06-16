package org.example.singletonClass.breakSingleton;

public class BreakUsingCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Create2 obj1 = Create2.getInstance();
        Create2 obj2 = (Create2) obj1.clone();
        System.out.println(obj1==obj2); // false break the singleton class
    }
}

 class Create2 implements Cloneable{
    // create private static field
    private static Create2 instance;
    // create all constructors as private
    private Create2(){

    }

    /* @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }*/

     @Override
     protected Object clone() throws CloneNotSupportedException {
         throw new CloneNotSupportedException("Not Supported!!");
     }

     // create static method with return the object
    public static Create2 getInstance(){
        if(instance == null){
            instance = new Create2();
        }
        return instance;
    }
}
