package com.common.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commonIOService.dto.RequestDTO;
import com.commonIOService.dto.ResponseDTO;
import com.commonIOService.exception.InputNotValid;
import com.common.manager.MainManager;

@RestController
public class MainController {

	@Autowired
	private MainManager mangr;
	
	@Autowired
	private ResponseDTO response;
	
	@RequestMapping(value = "/advanceCalculator", method = RequestMethod.POST)
	public ResponseEntity<?> controlFunction(@RequestBody @Valid RequestDTO request) throws Exception
	{
		if(request.getService().matches("[a-z]{6}_[a-z]{5}$")) {
			   throw new InputNotValid("Input string is not correct!!");     
		   }
		   
		   response.setResponse("Entered Strings is tested ok");
		   response.setResponseCode("00");
		   response.setResponseDesc("Successefully Runing");
		   
		return mangr.Operator(request);
		
	}	

	
}
