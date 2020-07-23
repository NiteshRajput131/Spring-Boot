package com.commonIOService.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
public class RequestDTO {
	
	private String service;
	
	@NotEmpty
//	@Pattern(regexp = "^((0[1-9])|([1-2][0-9])|(3[0-1]))/((1[0-2])|([1-9]))/[0-9]{4}$", message = "Please enter date in dd/mm/yyyy patern!!")
//	@Pattern(regexp = "^[1-9]|[1-9][0-9]|[1-9][0-9][0-9]|[0-9]*\\.[0-9][0-9]$", message = "Please enter the valid number!!")
	private String para1;

	@NotEmpty
//	@Pattern(regexp = "^((0[1-9])|([1-2][0-9])|(3[0-1]))/((1[0-2])|([1-9]))/[0-9]{4}$", message = "Please enter date in dd/mm/yyyy patern!!")
//	@Pattern(regexp = "^[1-9]|[1-9][0-9]|[1-9][0-9][0-9]$", message = "Please enter the valid number!!")
	private String para2;
	
}
