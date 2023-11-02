package com.springo;



import com.springo.controller.DepartementController;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans-config.xml");
        DepartementController controller = (DepartementController) context2.getBean("departementController");

    }
}
