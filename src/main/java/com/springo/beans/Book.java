package com.springo.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Book {
    @Autowired
    private Title titleBook;
    private String author;
    @Autowired
    private List<Chapter> chapters;

    public Book(Title title, String author, List<Chapter> chapters) {
        this.titleBook = title;
        this.author = author;
        this.chapters = chapters;
    }

    public Book() {
    }

    public Title getTitle() {
        return titleBook;
    }

    public void setTitle(Title title) {
        this.titleBook = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}
