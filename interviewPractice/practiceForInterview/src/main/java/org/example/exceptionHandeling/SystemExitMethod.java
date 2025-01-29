package org.example.exceptionHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SystemExitMethod {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("catch block");
            System.exit(0);
        } finally {
            System.out.println("finally block");
        }
    }
}
