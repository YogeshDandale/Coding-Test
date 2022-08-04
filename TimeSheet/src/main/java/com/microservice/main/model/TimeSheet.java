package com.microservice.main.model;

import java.time.DayOfWeek;
import java.time.Month;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSheet {
	@Id
	@GeneratedValue
	private Integer empId;
	
	private Month month;
	
	private DayOfWeek dayOfWeek;
	
	private Double workingHours;

}
