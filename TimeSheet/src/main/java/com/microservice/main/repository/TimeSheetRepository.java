package com.microservice.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.main.model.TimeSheet;

@Repository
public interface TimeSheetRepository extends JpaRepository<TimeSheet, Integer> {

public	Optional<TimeSheet> findByEmpId(Integer i);

}
