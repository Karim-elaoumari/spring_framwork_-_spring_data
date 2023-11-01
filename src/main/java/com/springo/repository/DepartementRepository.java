package com.springo.repository;

import com.springo.entities.Departement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.jpa.EntityManagerFactoryAccessor;
import org.springframework.stereotype.Repository;
@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
