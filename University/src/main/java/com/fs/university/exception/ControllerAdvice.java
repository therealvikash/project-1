package com.fs.university.exception;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler
{
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException  ex, 
			HttpHeaders headers, HttpStatus status,  WebRequest request)
	{
			
			List<String> errors = ex.getBindingResult()
					.getFieldErrors()
					.stream()
					.map((error->error
					.getDefaultMessage()))
					.collect(Collectors
					.toList());
			return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler((CollegesNotFound.class))
	public ResponseEntity<String> handleNameNotFoundException(CollegesNotFound collegesNotFound)
	{
		return new ResponseEntity<String>("College List is Empty!!!",HttpStatus.NOT_FOUND);
	}		
}
