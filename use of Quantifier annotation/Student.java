package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private int id;
    private String name;
    private String course;
    @Autowired
    @Qualifier("address1")
    private Address address;
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name      : " + name);
        System.out.println("Course    : " + course);
        System.out.println("Address    : " + address);
    }
}
