package org.example.interviewQuestions;

// create singleton class
public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass ();
        }
        return instance;
    }
}
class SingletonTest{
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        boolean isSame = obj1 == obj2;
        System.out.println(isSame);
    }
}