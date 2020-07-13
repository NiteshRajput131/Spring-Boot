package com.advance.computeDays.service;

import java.text.ParseException;

import org.springframework.http.ResponseEntity;

public interface DateService {

	ResponseEntity<?> ComputeDays(String date1, String date2) throws ParseException ;
}
