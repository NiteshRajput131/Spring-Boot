package com.commonIOService.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
public class ResponseDTO {

private Double result;

private String response = "";
private String responseCode = "";
private String responseDesc = "";

	
	public ResponseDTO(Double result) {
		super();
		this.result = result;
	}
	
}
