package org.example.serialization_deser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
             fis = new FileInputStream("src/main/java/org/example/serialization_deser/test.text");
             ois = new ObjectInputStream(fis);
            Employee e = (Employee) ois.readObject();
            System.out.println(e);
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
                ois.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
