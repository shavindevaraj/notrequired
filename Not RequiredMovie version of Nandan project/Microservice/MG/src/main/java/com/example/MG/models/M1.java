package com.example.MG.models;

public class M1 {

    private String classAId;
    private String name;
    private String description;

    public M1() {

    }

    public M1(String classAId, String name, String description) {
        this.classAId = classAId;
        this.name = name;
        this.description = description;
    }

    public String getMovieId() {
        return classAId;
    }

    public void setMovieId(String classAId) {
        this.classAId = classAId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
