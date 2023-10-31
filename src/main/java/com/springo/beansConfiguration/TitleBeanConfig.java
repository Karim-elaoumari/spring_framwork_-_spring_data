package com.springo.beansConfiguration;

import com.springo.beans.Title;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TitleBeanConfig {
    @Bean
    public Title titleBook() {
        return new Title("Title 1","Subtitle 1");
    }
    @Bean
    public Title titleChapter1() {
        return new Title("Chapter 1","Chapter 1 subtitle");
    }
    @Bean
    public Title titleChapter2() {
        return new Title("Chapter 2","Chapter 2 subtitle");
    }



}
