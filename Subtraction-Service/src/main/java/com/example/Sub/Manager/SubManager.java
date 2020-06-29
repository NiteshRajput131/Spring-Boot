package com.example.Sub.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Sub.DTO.SubRequestDTO;
import com.example.Sub.Service.SubService;

@Service
public class SubManager {

	@Autowired
	private SubService serv;
	
	public ResponseEntity<?> Operator(SubRequestDTO request) {
		
		return serv.subtraction(request.getNum1(),request.getNum2());
	}
}
