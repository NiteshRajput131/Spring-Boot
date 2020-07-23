package com.advance.computePower.service;

import org.springframework.http.ResponseEntity;

public interface PowerService {

	ResponseEntity<?> ComputePower(String num, String pow);
	
	

}
