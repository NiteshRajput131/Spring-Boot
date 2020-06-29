package com.example.prod.Servise;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

	ResponseEntity<?> multiplication(String num1,String num2);
	
}
