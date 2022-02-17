package com.example.MG.models;

public class M1 {

    private String classAId;
    private String name;
    private String college;

    public M1() {

    }

    public M1(String classAId, String name, String college) {
        this.classAId = classAId;
        this.name = name;
        this.college = college;
    }

    public String getStudentId() {
        return classAId;
    }

    public void setStudentId(String classAId) {
        this.classAId = classAId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
