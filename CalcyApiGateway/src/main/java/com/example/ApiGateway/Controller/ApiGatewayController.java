package com.example.ApiGateway.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ApiGateway.DTO.RequestDTO;
import com.example.ApiGateway.Service.ApiService;

@RestController
public class ApiGatewayController {

	@Autowired
	private ApiService service;

	@RequestMapping(value = "/calcy", method = RequestMethod.POST)
	public ResponseEntity<?> callApis(@Valid @RequestBody RequestDTO request) {
		return service.performOperation(request);

	}
}
