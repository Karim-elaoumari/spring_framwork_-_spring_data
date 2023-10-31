package com.springo.service.departement;

import com.springo.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DepartementServiceImpl implements DepartementService{
    public DepartementRepository departementRepository;
    @Autowired
    public DepartementServiceImpl(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }
}
