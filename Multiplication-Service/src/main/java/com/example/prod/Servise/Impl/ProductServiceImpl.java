package com.example.prod.Servise.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.common.dto.CommonResponse;
import com.example.prod.DTO.ProductResponceDTO;
import com.example.prod.Servise.ProductService;

/**
 * @author Nitesh
 *
 */
@Component
public class ProductServiceImpl implements ProductService {


	@Override
	public ResponseEntity<?> multiplication(String num1, String num2) {

		Integer mul = Integer.parseInt(num1) * Integer.parseInt(num2);
		CommonResponse response = new CommonResponse(mul.doubleValue());
	
		return ResponseEntity.ok(response);

	}

}
