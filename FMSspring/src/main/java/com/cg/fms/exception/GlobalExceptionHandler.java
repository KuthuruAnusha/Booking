package com.cg.fms.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(BookingException.class)
public @ResponseBody ResponseEntity<ErrorInfo>  handleException(BookingException ex,HttpServletRequest req)
{
	
	 String message=ex.getMessage();
	 String uri= req.getRequestURI();
	 
	 ErrorInfo  obj = new ErrorInfo(LocalDateTime.now(),message,uri);
	return new ResponseEntity<>(obj,HttpStatus.NOT_FOUND);
	
}

	

}
