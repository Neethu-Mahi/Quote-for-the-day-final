package com.kidsbuddy.mvc.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.kidsbuddy.mvc.rest.entity.ApiError;
import com.kidsbuddy.mvc.rest.exception.NoSuchWordException;
import com.kidsbuddy.mvc.rest.exception.UserNotFoundException;

@ControllerAdvice
public class ExceptionHandlerController {
		
	@ExceptionHandler(value= UserNotFoundException.class) 
	public ResponseEntity<?> handleUserNotFoundException(UserNotFoundException userNotFoundException) {
		ApiError  apiError			= new ApiError(userNotFoundException.getMessage(), "404");
		return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value= NoSuchWordException.class) 
	public ResponseEntity<?> handleNoSuchWordException(NoSuchWordException noSuchWordException) {
		ApiError  apiError			= new ApiError(noSuchWordException.getMessage(), "404");
		return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
	}
}
