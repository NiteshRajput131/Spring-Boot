package com.example.Sub.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sub.DTO.SubRequestDTO;
import com.example.Sub.Manager.SubManager;

@RestController
public class SubController {

	@Autowired
	private SubManager mangr;
	
	@RequestMapping(value = "/subtraction", method = RequestMethod.POST)
	public ResponseEntity<?> controlFunction(@RequestBody @Valid SubRequestDTO request)
	{
		return mangr.Operator(request);
	}
}
