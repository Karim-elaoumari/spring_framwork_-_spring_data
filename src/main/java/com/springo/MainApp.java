package com.springo;


import com.springo.beans.Book;
import com.springo.beansConfiguration.BookBeanConfig;
import com.springo.beansConfiguration.ChapterBeanConfig;
import com.springo.beansConfiguration.TitleBeanConfig;
import com.springo.controller.EmployerController;
import com.springo.repository.DepartementRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.instrument.ClassDefinition;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BookBeanConfig.class, TitleBeanConfig.class, ChapterBeanConfig.class);
        Book book = (Book) context.getBean(Book.class);

        System.out.println(book.getTitle().getName());ApplicationContext context2 = new ClassPathXmlApplicationContext("beans-config.xml");
        EmployerController controller = (EmployerController) context2.getBean("departementController");


    }
}
