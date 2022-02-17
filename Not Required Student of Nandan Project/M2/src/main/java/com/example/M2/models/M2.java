package com.example.M2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table
public class M2 {

    @Id
    private String classBId;
    @Column
    private String classAId;
    @Column
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
