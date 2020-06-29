package com.example.ApiGateway.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.common.dto.CommonResponse;
import com.example.ApiGateway.DTO.RequestDTO;
import com.example.ApiGateway.DTO.ResponseDTO;


@Service
public class ApiService {
	
	@Value("${url_addService}")
	private String additionURL;
	
	@Value("${url_subService}")
	private String subtractURL;

	@Value("${url_prodService}")
	private String multiplyURL;

	@Value("${url_divService}")
	private String divideURL;


	private CommonResponse result;
	
	@Autowired
	private ResponseDTO response;
	
	
	public ResponseEntity<?> performOperation(RequestDTO request) {
		
		RestTemplate restTemp = new RestTemplate();
		
//		return ResponseEntity.ok(restTemp.postForObject(additionURL, request, CommonResponse.class));
		
		result = restTemp.postForObject(additionURL, request, CommonResponse.class); 
		response.setAddition(result.getResponse());
		
		result = restTemp.postForObject(subtractURL, request, CommonResponse.class); 
		response.setSubtraction(result.getResponse());
		
		result = restTemp.postForObject(multiplyURL, request, CommonResponse.class); 
		response.setProduct(result.getResponse());
		
		result = restTemp.postForObject(divideURL, request, CommonResponse.class); 
		response.setDivision(result.getResponse());
		
		return ResponseEntity.ok(response);
		
	}
	
}

