package com.example.Sub.Service.Impl;

import org.omg.CORBA.OMGVMCID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.common.dto.CommonResponse;
import com.example.Sub.DTO.SubResponceDTO;
import com.example.Sub.Service.SubService;

@Component
public class SubServiceImpl implements SubService {

    @Override
	public ResponseEntity<?> subtraction(String num1, String num2) {
		Integer sub = Integer.parseInt(num1) - Integer.parseInt(num2);
		
		CommonResponse response = new CommonResponse(sub.doubleValue());
	
		return ResponseEntity.ok(response);
	}

}
