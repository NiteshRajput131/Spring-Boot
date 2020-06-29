package com.example.Division.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Division.DTO.DivideRequestDTO;
import com.example.Division.Service.DivideService;


@Service
public class DivideManager {

	@Autowired
	private DivideService serv;
	
	public ResponseEntity<?> Operator(DivideRequestDTO request) {
		
		return serv.division(request.getNum1(),request.getNum2());
	}
}
