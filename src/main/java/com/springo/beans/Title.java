package com.springo.beans;

public class Title {
    private String name;
    private String subName;


    public Title(String name, String subName) {
        this.name = name;
        this.subName = subName;
    }
    public Title() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
