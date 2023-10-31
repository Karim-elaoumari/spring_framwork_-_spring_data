package com.springo.controller;

import com.springo.service.departement.DepartementService;
import com.springo.service.departement.DepartementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan("com.springo.service.departement")
public class DepartementController {
    public DepartementService departementService;
    @Autowired
    public DepartementController(DepartementService departementService) {
        this.departementService = departementService;
    }
}
