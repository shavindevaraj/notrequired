package com.example.orderservice;
public class Course {
    private final int id;
    private final int studentId;
    private final String name;

    public Course(final int id, final int studentId, final String name) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}