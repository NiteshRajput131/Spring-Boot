package com.example.ApiGateway.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {


	@NotEmpty
	@Pattern(regexp = "^[1-9 ]{3}$", message = "Please enter the valid number!!")
	private String num1;

	@NotEmpty
	@Pattern(regexp = "^[1-9 ]{3}$", message = "Please enter the valid number!!")
	private String num2;


}
