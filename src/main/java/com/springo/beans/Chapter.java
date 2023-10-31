package com.springo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Chapter {
    @Autowired

    private Title titleChapter1;
    private String content;

    public Chapter() {
    }

    public Chapter(Title title, String content) {
        this.titleChapter1 = title;
        this.content = content;
    }

    public Title getTitle() {
        return titleChapter1;
    }

    public void setTitle(Title title) {
        this.titleChapter1 = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
