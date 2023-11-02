package com.springo.repository;

import com.springo.entities.Departement;
import com.springo.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
