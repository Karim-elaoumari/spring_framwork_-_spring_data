package com.springo.beansConfiguration;

import com.springo.beans.Chapter;
import com.springo.beans.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
public class ChapterBeanConfig {

    @Bean
    public Chapter chapter1() {
        return new Chapter();
    }
    @Bean
    public Chapter chapter2() {
        return new Chapter();
    }

}
