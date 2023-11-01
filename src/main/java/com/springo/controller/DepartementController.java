package com.springo.controller;

import com.springo.service.departement.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;


public class DepartementController {
    public DepartementService departementService;
    public DepartementController(DepartementService departementService) {
        this.departementService = departementService;
    }
}
