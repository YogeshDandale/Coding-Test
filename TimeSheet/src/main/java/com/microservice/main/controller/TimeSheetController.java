package com.microservice.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.main.model.TimeSheet;
import com.microservice.main.service.TimeSheetService;

@RestController
@RequestMapping("/api")
public class TimeSheetController {
	

	@Autowired
	private  TimeSheetService timeSheetservice;
	
	@PostMapping("/time")
	public ResponseEntity<TimeSheet>postData(@RequestBody TimeSheet sheet){
		
		return new ResponseEntity<TimeSheet>(timeSheetservice.postData(sheet),HttpStatus.CREATED);
	}
	
	@GetMapping("/time")
	public ResponseEntity<Iterable<TimeSheet>>getData(){
		return new ResponseEntity<Iterable<TimeSheet>>(timeSheetservice.getData(),HttpStatus.OK);
	}
	
	@PutMapping("/time/{empId}")
	public ResponseEntity<String>updateData(@PathVariable("empId") Integer i,@RequestBody TimeSheet sheet){
		return new ResponseEntity<String>(timeSheetservice.updateData(i,sheet),HttpStatus.OK);
	}
	
	@DeleteMapping("/time/{empId}")
	public ResponseEntity<String>deleteData(@PathVariable("empId") Integer i){
		return new ResponseEntity<String>(timeSheetservice.deleteData(i),HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/time/{empId}")
	public ResponseEntity<TimeSheet>findById(@PathVariable("empId") Integer i){
		return new ResponseEntity<TimeSheet>(timeSheetservice.findById(i),HttpStatus.OK);
	}
}
