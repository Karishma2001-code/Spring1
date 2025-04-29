package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Student {
    private int id;
    private String name;
    private String course;
    private Address address;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name      : " + name);
        System.out.println("Course    : " + course);
        System.out.println("Address    : " + address);
    }
}
