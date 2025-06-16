package org.example.serialization.questionImp;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    //we haven’t declared SerialVersionUId
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String addedField;
    private int nn;
    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Employee() {
    }
    public Employee(Integer id, String name, String addedField) {
        this.id = id;
        this.name = name;
        this.addedField = addedField;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
public class SerializeEmployee {
    public static void main(String[] args) {
        Employee object1 = new Employee(1, "amy");
        Employee object2 = new Employee(2, "ankit");

        try {
            OutputStream fout = new FileOutputStream("ser.txt");
            ObjectOutput oout = new ObjectOutputStream(fout);
            System.out.println("Serialization process has started, serializing employee objects...");
            oout.writeObject(object1);
            oout.writeObject(object2);
            fout.close();
            oout.close();
            System.out.println("Object Serialization completed.");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}