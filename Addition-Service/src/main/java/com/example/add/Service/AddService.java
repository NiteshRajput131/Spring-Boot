package com.example.add.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.add.DTO.RequestDTO;

@Service
public interface AddService {

	ResponseEntity<?> addition(String num1, String num2);
	
}
