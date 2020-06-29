package com.example.add.Service.Impl;

import org.hibernate.validator.internal.util.privilegedactions.GetResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.common.dto.CommonResponse;
import com.example.add.DTO.RequestDTO;

import com.example.add.Service.AddService;

@Component
public class AddServiceImpl implements AddService {

	@Override
	public ResponseEntity<?> addition(String num1, String num2) {
		Integer add = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		CommonResponse response = new CommonResponse(add.doubleValue());
		
		return ResponseEntity.ok(response); 
	}

}
