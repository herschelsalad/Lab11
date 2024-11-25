/**
* File: Lab11Pron1.java
* Class: CSCI 1302
* Author: Nikiema Michael & Herschel Braddock
* Created on: Nov 23, 2025
* Last Modified: Nov 23, 2025
* Description: Read a Binary file
*/

import java.io.*;

public class Lab11Prob01 {

    public static void main(String[] args) {
        readBinaryFile("src/people.dat");
    }

    public static void readBinaryFile(String filePath) {
        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new FileInputStream(filePath));

            // Declare variables outside the loop
            int age;
            String name;
            String address;
            int zipCode;
            double salary;

            while (true) {
                try {
                    // Read data into previously declared variables
                    age = dis.readInt();
                    name = dis.readUTF();
                    address = dis.readUTF();
                    zipCode = dis.readInt();
                    salary = dis.readDouble();

                    System.out.printf("%d %s %s %d %.2f\n", age, name, address, zipCode, salary);

                } catch (EOFException eof) {
                    break; // End of file reached
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
