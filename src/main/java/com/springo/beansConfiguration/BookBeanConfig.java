package com.springo.beansConfiguration;

import com.springo.beans.Book;
import com.springo.beans.Chapter;
import com.springo.beans.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;
@Import({TitleBeanConfig.class,ChapterBeanConfig.class})

@Configuration
public class BookBeanConfig {
    @Bean
    public Book book1() {
        return new Book();
    }
}
