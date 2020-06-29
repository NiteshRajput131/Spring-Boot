package com.example.Division.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.common.dto.CommonResponse;
import com.example.Division.DTO.DivideResponceDTO;
import com.example.Division.Service.DivideService;

/**
 * @author Nitesh
 *
 */
@Component
public class DivideServiceImpl implements DivideService {

	@Autowired
	private DivideResponceDTO respon;

	@Override
	public ResponseEntity<?> division(String num1, String num2) {

		Float div = Float.parseFloat(num1) / Float.parseFloat(num2);
		
		CommonResponse response = new CommonResponse(div.doubleValue());
	
		return ResponseEntity.ok(response);

	}

}
