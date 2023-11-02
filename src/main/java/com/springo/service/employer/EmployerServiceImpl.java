package com.springo.service.employer;

import com.springo.repository.EmployerRepository;



public class EmployerServiceImpl implements EmployerService{

    public EmployerRepository employerRepository;
    public EmployerServiceImpl(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }




}
