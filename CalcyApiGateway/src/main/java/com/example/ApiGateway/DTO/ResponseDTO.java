package com.example.ApiGateway.DTO;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {


	  private Double addition;
	  private Double subtraction; 
	  private Double product; 
	  private Double division;
	
}
