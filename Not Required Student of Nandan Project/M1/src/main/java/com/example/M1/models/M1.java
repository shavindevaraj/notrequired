package com.example.M1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class M1 {
    @Id
    private String classAId;
    @Column
    private String name;
    @Column
    private String college;

    public M1() {

    }

    public M1(String classAId, String name, String college) {
        this.classAId = classAId;
        this.name = name;
        this.college = college;
    }

    public String getClassAId() {
        return classAId;
    }

    public void setClassAId(String classAId) {
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
