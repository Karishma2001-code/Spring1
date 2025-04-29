package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("2")
    private int id;
    @Value("Komal")
    private String name;
    @Value("IT")
    private String course;

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name      : " + name);
        System.out.println("Course    : " + course);
    }
}

