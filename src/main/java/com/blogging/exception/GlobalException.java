package com.blogging.exception;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalException {

   @ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFound(ResourceNotFoundException ex){
	   
	   String message = ex.getMessage();
	   
		return new ResponseEntity<>( message, HttpStatus.NOT_FOUND);
		
	}
   
   @ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> argumentTypeMismatch(MethodArgumentNotValidException ex){
	   
	   HashMap<String ,String> map = new HashMap<>();
	   
	   ex.getBindingResult().getAllErrors().forEach((error) ->{
		   String fieldName = ((FieldError)error).getField();
		   String message = error.getDefaultMessage();
		   map.put(fieldName, message);
	   });
	   String message = ex.getMessage();
	   
		return new ResponseEntity<>( map, HttpStatus.NOT_FOUND);
		
	}
}
