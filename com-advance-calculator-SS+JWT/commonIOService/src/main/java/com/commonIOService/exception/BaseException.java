package com.commonIOService.exception;

public class BaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1441286883622317484L;

	public BaseException() {
		super();
	}
	
	public BaseException(String errorMessage) {
		super(errorMessage);
	}
}
