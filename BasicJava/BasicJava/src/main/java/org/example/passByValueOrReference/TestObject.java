package org.example.passByValueOrReference;

public class TestObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("nana");
        animal.setAge(5);
        System.out.println("original animal :" + animal);
        TestObject obj = new TestObject();
        obj.modifyAnimal(animal);
        System.out.println("after modifyAnimal method animal: " + animal);
    }

    public void modifyAnimal(Animal animal) {
        animal = new Animal(1245, "jaoidfjaoifj");
        System.out.println("reassignment : " + animal);
        /*animal.setAge(animal.getAge()*10);
        animal.setName(animal.getName().concat("123456"));
        System.out.println("modified animal : "+animal);*/
    }
}

class Animal {
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

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
