package com.example.MG.models;

public class M2 {

    private String classBId;

    private String classAId;

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
