package com.common.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commonIOService.dto.RequestDTO;
import com.commonIOService.dto.ResponseDTO;
import com.commonIOService.JwtDto.*;
import com.commonIOService.exception.InputNotValid;
import com.common.manager.MainManager;
import com.common.securityConfig.JWTRequestFilter;
import com.common.securityConfig.JWTUtil;
import com.common.securityConfig.JwtUserDetailsService;

@RestController
public class MainController {

	@Autowired
	private MainManager mangr;
	
	@Autowired
	private AuthenticationManager AuthenticationManager;
	
	@Autowired
	private JWTUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequestDTO authenticationRequest) throws Exception {

		
		  authenticate(authenticationRequest.getUsername(),
		  authenticationRequest.getPassword());
		  
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		 
		final String token = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new JwtResponseDTO(token));
	}

	
	private void authenticate(String username, String password) throws Exception {
		try {
			AuthenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
	 
	
	@RequestMapping(value = "/advanceCalculator", method = RequestMethod.POST)
	public ResponseEntity<?> controlFunction(@RequestBody @Valid RequestDTO request) throws Exception
	{
		if(request.getService().matches("[a-z]{6}_[a-z]{5}$")) {
			   throw new InputNotValid("Input string is not correct!!");     
		   }
		   
		return mangr.Operator(request);
		
	}	

	
}
