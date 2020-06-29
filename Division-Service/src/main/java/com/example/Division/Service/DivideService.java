package com.example.Division.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface DivideService {

	ResponseEntity<?> division(String num1,String num2);
	
}
