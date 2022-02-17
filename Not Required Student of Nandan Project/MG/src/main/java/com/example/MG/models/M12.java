package com.example.MG.models;

public class M12 {
    private String name;
    private String college;
    private String course;
    private String classAId;

    public M12() {

    }

    public M12(String name, String college, String course, String classAId) {
        this.name = name;
        this.college = college;
        this.course = course;
        this.classAId = classAId;
    }

    public void setStudentId(String classAId) {
        this.classAId = classAId;
    }

    public String getStudentId() {
        return classAId;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
