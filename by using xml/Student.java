package org.example;

public class Student {
    private int id;
    private String name;
    private String course;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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
