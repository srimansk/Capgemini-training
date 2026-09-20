package com.example;

public class Student {

    private int id;
    private String name;
    private String course;
    private String email;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int id, String name, String course, String email) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.email = email;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", course=" + course +
                ", email=" + email + "]";
    }
}