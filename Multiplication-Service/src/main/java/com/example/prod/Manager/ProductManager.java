package com.example.prod.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.prod.DTO.ProductRequestDTO;
import com.example.prod.Servise.ProductService;

@Service
public class ProductManager {

	@Autowired
	private ProductService serv;
	
	public ResponseEntity<?> Operator(ProductRequestDTO request) {
		
		return serv.multiplication(request.getNum1(),request.getNum2());
	}
}
