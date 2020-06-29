package com.example.Sub.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface SubService {

	ResponseEntity<?> subtraction(String num1,String num2);
	
}
