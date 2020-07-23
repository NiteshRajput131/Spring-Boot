package com.advance.computeDays.service.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.advance.computeDays.service.DateService;
import com.commonIOService.dto.ResponseDTO;

@Component
public class DateServiceImpl implements DateService  {

//	RequestDTO request;
//	ResponseDTO response;
	
	/*
	 * float daysBetween; long difference;
	 */
	
	SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");

	ResponseDTO response;
	@Override
	public ResponseEntity<?> ComputeDays(String date1, String date2) throws ParseException {
		
		Date dateBefore = myFormat.parse(date1);
		Date dateAfter = myFormat.parse(date2);
		long difference = dateAfter.getTime() - dateBefore.getTime();
		Double daysBetween = (double) (difference / (1000 * 60 * 60 * 24));

		response = new ResponseDTO(daysBetween);
		response.setResponse("Entered Strings is tested ok");
		response.setResponseCode("00");
		response.setResponseDesc("Successefully Runing");

		return ResponseEntity.ok(response);

	}

}
