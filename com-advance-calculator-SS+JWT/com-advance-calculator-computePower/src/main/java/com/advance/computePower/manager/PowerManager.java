package com.advance.computePower.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.commonIOService.dto.RequestDTO;
import com.advance.computePower.service.PowerService;

@Service
public class PowerManager {

	@Autowired
	private PowerService service1;
	
	public ResponseEntity<?> Operator(RequestDTO request) {

		return service1.ComputePower(request.getPara1(),request.getPara2());
	}
}
