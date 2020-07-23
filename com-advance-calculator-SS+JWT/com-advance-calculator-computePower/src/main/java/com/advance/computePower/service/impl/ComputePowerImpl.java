package com.advance.computePower.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.commonIOService.dto.ResponseDTO;
import com.advance.computePower.service.PowerService;

@Component
public class ComputePowerImpl implements PowerService {

	@Override
	public ResponseEntity<?>ComputePower(String num, String pow) {

		Double val = 1.0 ;
		Double x = Double.parseDouble(num);
		Double y = Double.parseDouble(pow);
	
		while (y != 0) {
			val = val * x;
			y--;
		}
		

		ResponseDTO response = new ResponseDTO(val);
		 response.setResponse("Entered Strings is tested ok");
		 response.setResponseCode("00");
		 response.setResponseDesc("Successefully Runing");
		return ResponseEntity.ok(response);
	}

	
}
