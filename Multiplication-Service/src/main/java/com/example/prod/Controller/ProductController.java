package com.example.prod.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.prod.DTO.ProductRequestDTO;
import com.example.prod.Manager.ProductManager;

@RestController
public class ProductController {

	@Autowired
	private ProductManager mangr;
	
	@RequestMapping(value = "/multiply", method = RequestMethod.POST)
	public ResponseEntity<?> controlFunction(@RequestBody @Valid ProductRequestDTO request)
	{
		return mangr.Operator(request);
	}
}
