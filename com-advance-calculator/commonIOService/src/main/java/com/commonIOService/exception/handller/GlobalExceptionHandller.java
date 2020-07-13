package com.commonIOService.exception.handller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.commonIOService.dto.ResponseDTO;
import com.commonIOService.exception.InputNotValid;



public class GlobalExceptionHandller {

	@Autowired
	ResponseDTO response;
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders httpHeaders, HttpStatus httpStatus, WebRequest webReq)
	{
		
		response.setResponseCode("96");
		response.setResponseDesc(ex.getBindingResult().getFieldError().getDefaultMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		
	}
	
	@ExceptionHandler({InputNotValid.class})
	public ResponseEntity<Object> handleInputNotValid(InputNotValid ex, WebRequest webReq)
	{
		
		response.setResponseCode("90");
		response.setResponseDesc(ex.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		
	}

	
}
