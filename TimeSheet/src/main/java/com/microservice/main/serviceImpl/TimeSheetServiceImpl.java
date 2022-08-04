package com.microservice.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.main.exception.ProductNotFoundException;
import com.microservice.main.model.TimeSheet;
import com.microservice.main.repository.TimeSheetRepository;
import com.microservice.main.service.TimeSheetService;

@Service
public class TimeSheetServiceImpl implements TimeSheetService {

	@Autowired
	private TimeSheetRepository repository;

	@Override
	public TimeSheet postData(TimeSheet sheet) {
		
		TimeSheet save = repository.save(sheet);
		
		return save;
	}

	@Override
	public Iterable<TimeSheet> getData() {
		Iterable<TimeSheet> l=repository.findAll();
		return l;
	}

	@Override
	public String updateData(Integer i, TimeSheet sheet) {
		sheet.setEmpId(i);
		TimeSheet save = repository.save(sheet);
		return "Update Data SuccessFully";
	}

	@Override
	public String deleteData(Integer i) {
		repository.deleteById(i);
		return "Delete Data SuccessFully ";
	}

	@Override
	public TimeSheet findById(Integer i) {
		
		Optional<TimeSheet> optional=repository.findByEmpId(i);
		if(optional.isPresent()) {
		 TimeSheet timeSheet = optional.get();
		 return timeSheet;
		 
		}
		else {
			throw new ProductNotFoundException("Not present data for this employee Id :"+i);
		}
	}


	
}
