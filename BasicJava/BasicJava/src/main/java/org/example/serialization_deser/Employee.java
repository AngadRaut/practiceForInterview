package org.example.serialization_deser;

import java.io.*;

public class Employee implements Serializable {

    private static final long serialVeresionUID = 100L;
    public String name;
    public String company_name;
    public int emp_id;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", emp_id=" + emp_id +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Sk Elaf Ahmed";
        e1.company_name = "Siksha.com";
        e1.emp_id = 1;
        try {
            FileOutputStream fileOut = new FileOutputStream("src/main/java/org/example/serialization_deser/test.text");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e1);
            out.close();
            fileOut.close();

            System.out.println("Our data is serialized and saved in disk storage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
