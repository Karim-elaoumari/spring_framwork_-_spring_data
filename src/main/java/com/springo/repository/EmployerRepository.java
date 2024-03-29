package com.springo.repository;

import com.springo.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployerRepository extends JpaRepository<Employer, Long>{
}
