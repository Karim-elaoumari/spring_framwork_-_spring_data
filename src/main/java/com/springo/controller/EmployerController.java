package com.springo.controller;

import com.springo.service.employer.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


public class EmployerController {
    public EmployerService employerService;
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }
}
