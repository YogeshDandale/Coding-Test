package com.microservice.main.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandle {

	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ApiError>globalexception(ProductNotFoundException e,WebRequest request ){
		ApiError apiError=new ApiError(new Date(),e.getMessage(),request.getDescription(false));
		return new  ResponseEntity<ApiError>(apiError,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError>exception(Exception e,WebRequest request ){
		ApiError apiError=new ApiError(new Date(),e.getMessage(),request.getDescription(false));
		return new  ResponseEntity<ApiError>(apiError,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
