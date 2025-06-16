package org.example.collections;

 class StudentInformation {
    private String id;
    private String name;

    public StudentInformation(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentInformation(){

    }
    // Getters and setters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentInformation that = (StudentInformation) obj;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

public class StudentInformationDemo{
    public static void main(String[] args) {
        StudentInformation obj1 = new StudentInformation("1","nana");
        StudentInformation obj2 = new StudentInformation("2","nana");
        System.out.println(obj1.equals(obj2));   // false
        System.out.println(obj1==obj2);          // false
    }
}
