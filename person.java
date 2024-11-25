/**
* File: Person.java
* Class: CSCI 1302
* Author: Nikiema Michael & Herschel Braddock
* Created on: Nov 23, 2025
* Last Modified: Nov 23, 2025
* Description: Save new file correctly using Objects
*/

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public class Person implements Serializable, Comparable<Person> {
    
    private int age;
    private String name;
    private String address;
    private int zipCode;
    private double salary;

    // Default constructor
    public Person() {}

    // constructor
    public Person(int age, String name, String address, int zipCode, double salary) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.salary = salary;
    }

    // Accessors and mutators
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return String.format("%d %s %s %d %s",
                age, name, address, zipCode, currencyFormat.format(salary));
    }

    // Comparable implementation to sort by salary in descending order
    @Override
    public int compareTo(Person other) {
        return Double.compare(other.salary, this.salary);
    }
}
