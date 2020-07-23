package com.advance.computeDays.manager;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.advance.computeDays.service.DateService;
import com.commonIOService.dto.RequestDTO;

@Service
public class DateManager {

	@Autowired
	private DateService serv;
	
	public ResponseEntity<?> Operator(@Valid RequestDTO request) throws ParseException {

		return serv.ComputeDays(request.getPara1(),request.getPara2());
	}
}
