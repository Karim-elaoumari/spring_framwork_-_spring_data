package com.springo.controller;

import com.springo.service.departement.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/app")
public class DepartementController {
    public DepartementService departementService;
    public DepartementController(DepartementService departementService) {
        this.departementService = departementService;
    }
    @GetMapping("/hello-world")
    @ResponseBody
    public String index() {
        return "Congratulations on creating your first controller";
    }
}
