package com.example.customerservice;
public class Student {
    private final int id;
    private final String name;
    private final String college;

    public Student(final int id,  final String name,final String college) {
        this.id = id;
        this.name = name;
        this.college=college;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getCollege(){
        return college;
    }
}