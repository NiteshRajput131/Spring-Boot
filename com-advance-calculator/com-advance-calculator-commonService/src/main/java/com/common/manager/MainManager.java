package com.common.manager;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.advance.computePower.service.PowerService;
import com.advance.computeDays.service.DateService;
import com.commonIOService.dto.RequestDTO;

@Service
public class MainManager {

	@Autowired
	private PowerService service1;
	
	@Autowired
	private DateService service2;
	
	private String str1 = new String("compute_power");
	private String str2 = new String("compute_date");
	
	
	public ResponseEntity<?> Operator(@Valid RequestDTO request) throws Exception {

		String Service = new String(request.getService());
		if(Service.equals(str1))
		{
			return service1.ComputePower(request.getPara1(),request.getPara2());
		}
		else
		{
			return service2.ComputeDays(request.getPara1(),request.getPara2());
		}
			
	}
}
