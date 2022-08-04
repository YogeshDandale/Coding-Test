package com.microservice.main.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.microservice.main.model.TimeSheet;

public interface TimeSheetService {

public	TimeSheet postData(TimeSheet sheet);

public Iterable<TimeSheet> getData();

public String updateData(Integer i, TimeSheet sheet);

public String deleteData(Integer i);

public TimeSheet findById(Integer i);



}
