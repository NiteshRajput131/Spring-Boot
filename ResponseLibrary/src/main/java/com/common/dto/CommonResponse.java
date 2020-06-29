package com.common.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
public class CommonResponse {
	

private Double response;

public CommonResponse(Double response) {
	super();
	this.response = response;
}

  

}
