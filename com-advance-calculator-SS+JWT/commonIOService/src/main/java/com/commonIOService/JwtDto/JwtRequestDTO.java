package com.commonIOService.JwtDto;

import javax.validation.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import lombok.Data;


@Data
@Component
public class JwtRequestDTO {
	
		
	@NotEmpty
	private String username;

	@NotEmpty
	private String password;
	
	public JwtRequestDTO()
	{
		
	}

	public JwtRequestDTO(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	
}
