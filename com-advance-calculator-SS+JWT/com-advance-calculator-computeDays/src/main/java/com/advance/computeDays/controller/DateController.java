package com.advance.computeDays.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.advance.computeDays.manager.DateManager;
import com.commonIOService.dto.RequestDTO;

@RestController
public class DateController {

	@Autowired
	private DateManager mangr;

	@RequestMapping(value = "/Date", method = RequestMethod.POST)
	public ResponseEntity<?> controlFunction(@RequestBody @Valid RequestDTO request) throws ParseException {
		return mangr.Operator(request);
	}

}
