package com.example.add.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.add.DTO.RequestDTO;
import com.example.add.Manager.AddManager;

@RestController
public class AddController {

	@Autowired
	private AddManager mangr;
	
	@RequestMapping(value = "/addition", method = RequestMethod.POST)
	public ResponseEntity<?> controlFunction(@RequestBody @Valid RequestDTO request)
	{
		return mangr.Operator(request);
	}
}
