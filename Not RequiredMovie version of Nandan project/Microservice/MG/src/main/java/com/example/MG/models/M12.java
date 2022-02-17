package com.example.MG.models;

public class M12 {
    private String name;
    private String desc;
    private String rating;
    private String classAId;

    public M12() {

    }

    public M12(String name, String desc, String rating, String classAId) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.classAId = classAId;
    }

    public void setMovieId(String classAId) {
        this.classAId = classAId;
    }

    public String getMovieId() {
        return classAId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
