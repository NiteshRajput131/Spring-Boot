package com.commonIOService.JwtDto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class JwtResponseDTO {

private String token = "";

public JwtResponseDTO(String token) {
	super();
	this.token = token;
}



}
