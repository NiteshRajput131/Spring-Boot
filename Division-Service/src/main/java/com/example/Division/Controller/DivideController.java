package com.example.Division.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Division.DTO.DivideRequestDTO;
import com.example.Division.Manager.DivideManager;

@RestController
public class DivideController {

	@Autowired
	private DivideManager mangr;
	
	@RequestMapping(value = "/division", method = RequestMethod.POST)
	public ResponseEntity<?> controlFunction(@RequestBody @Valid DivideRequestDTO request)
	{
		return mangr.Operator(request);
	}
}
