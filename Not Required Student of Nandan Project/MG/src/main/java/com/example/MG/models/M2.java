package com.example.MG.models;

public class M2 {

    private String classBId;

    private String classAId;

    private String course;

    public M2() {

    }

    public M2(String classBId, String classAId, String course) {
        this.classAId = classAId;
        this.classBId = classBId;
        this.course = course;
    }

    public String getStudentId() {
        return classAId;
    }

    public void setStudentId(String classAId) {
        this.classAId = classAId;
    }

    public String getRid() {
        return classBId;
    }

    public void setRid(String classBId) {
        this.classBId = classBId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
