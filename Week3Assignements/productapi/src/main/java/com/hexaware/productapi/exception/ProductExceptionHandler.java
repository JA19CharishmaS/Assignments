package com.hexaware.productapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionHandler {
	
	@ExceptionHandler({Exception.class})
  public  ResponseEntity <String> handleAnyException(Exception e)
  {
	 return  new ResponseEntity <String>(e.getMessage(),HttpStatus.BAD_REQUEST);
  }
}
