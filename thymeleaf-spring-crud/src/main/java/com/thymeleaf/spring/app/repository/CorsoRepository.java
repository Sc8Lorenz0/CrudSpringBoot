package com.thymeleaf.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymeleaf.spring.app.model.Corso;



@Repository
public interface CorsoRepository extends JpaRepository<Corso, Long> {

}
