package org.example.object_class;

import java.util.Objects;

public class EqualsMethodOverriding {
    public static void main(String[] args) {
        Student student1 = new Student("nama", 45, "Goverment");
        Student student2 = new Student("bhani", 5, "Private");
        Student student3 = new Student("nama", 45, "Goverment");
        Student student4 = student1;
        // before overriding the equals method
       /* System.out.println(student1.equals(student2));  // false
        System.out.println(student1.equals(student3));  // false
        System.out.println(student2.equals(student3));  // false
        System.out.println(student1.equals(student4));  // true*/
        System.out.println(student1 == student2);  // false
        System.out.println(student1 == student3);  // false
        System.out.println(student2 == student3);  // false
        System.out.println(student1 == student4);  // true
        System.out.println();
        // after overriding the equals method and providing custom logic into it
        System.out.println(student1.equals(student2));  // false
        System.out.println(student1.equals(student3));  // true
        System.out.println(student2.equals(student3));  // false
        System.out.println(student1.equals(student4));  // true
    }
}

class Student {
    String name;
    int age;
    String school;

    // when i am using direct implementation through the intellij
  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(school, student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, school);
    }*/
    // my own implementation
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Student) {
            Student student = (Student) o;
            if (this.age == student.age && this.name.equals(student.name) && this.school.equals(student.school)) {
                return true;
            } else {
                return false;
            }
    } else {
        return false;
    }
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getSchool() {
    return school;
}

public void setSchool(String school) {
    this.school = school;
}

public Student() {
}

public Student(String name, int age, String school) {
    this.name = name;
    this.age = age;
    this.school = school;
}

@Override
public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", school='" + school + '\'' +
            '}';
}
}