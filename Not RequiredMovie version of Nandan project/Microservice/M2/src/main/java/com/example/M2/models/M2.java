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
    private String rating;

    public M2() {

    }

    public M2(String classBId, String classAId, String rating) {
        this.classAId = classAId;
        this.classBId = classBId;
        this.rating = rating;
    }

    public String getMovieId() {
        return classAId;
    }

    public void setMovieId(String classAId) {
        this.classAId = classAId;
    }

    public String getRid() {
        return classBId;
    }

    public void setRid(String classBId) {
        this.classBId = classBId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
