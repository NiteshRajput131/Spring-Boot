package com.commonIOService.exception;

public class InputNotValid extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7916117096121424802L;

	public InputNotValid() {
		super();
	}
	public InputNotValid(String errormessage) {
		super(errormessage);
	}
	
}
