package com.example.add.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.add.DTO.RequestDTO;
import com.example.add.Service.AddService;

@Service
public class AddManager {

	@Autowired
	private AddService serv;

	public ResponseEntity<?> Operator(RequestDTO request) {

		return serv.addition(request.getNum1(),request.getNum2());
	}

}
