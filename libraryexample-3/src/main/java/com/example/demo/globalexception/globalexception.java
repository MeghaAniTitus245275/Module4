package com.example.demo.globalexception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exceptions.BooknotFoundException;
import com.example.demo.exceptions.UserNotFoundException;


@RestControllerAdvice
//@RestControllerAdvice
public class globalexception {
	
	 @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	    @ExceptionHandler(UserNotFoundException.class)
	    public Map<String, String> handleBusinessException(UserNotFoundException ex) {
	        Map<String, String> errorMap = new HashMap<>();
	        errorMap.put("errorMessage", ex.getMessage());
	        return errorMap;
	    }
	 
	 
 
	 @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	 @ExceptionHandler(BooknotFoundException.class)
	 public Map<String,String> handlesomeexception(BooknotFoundException bk)
	 {
		 Map<String,String> errormap = new HashMap<>();
		 errormap.put("errormessage2", bk.getMessage());
		 return errormap;
	 }
	

}
