package com.advance.computePower.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.advance.computePower.manager.PowerManager;
import com.commonIOService.dto.RequestDTO;

@RestController
public class PowerController {

	@Autowired
	private PowerManager mangr;

	@RequestMapping(value = "/Power", method = RequestMethod.POST)
	public ResponseEntity<?> controlFunction(@RequestBody @Valid RequestDTO request) {
		return mangr.Operator(request);
	}

}
