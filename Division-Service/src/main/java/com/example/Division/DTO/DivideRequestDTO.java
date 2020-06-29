package com.example.Division.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class DivideRequestDTO {

  @NotEmpty  
  @Pattern(regexp = "^[1-9 ]{3}$", message = "Please enter the valid number!!")
    private String num1;
	private String num2;
}
