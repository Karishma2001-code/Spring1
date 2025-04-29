package org.example;

public class Student {
    private int id;
    private String name;
    private String course;
    private Address address;
    public Student(int id, String name, String course, Address address) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.address=address;
    }
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name      : " + name);
        System.out.println("Course    : " + course);
        System.out.println("Address    : " + address);
    }
}
