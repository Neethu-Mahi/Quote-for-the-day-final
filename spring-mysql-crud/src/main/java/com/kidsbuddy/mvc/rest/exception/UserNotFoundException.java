package com.kidsbuddy.mvc.rest.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8143033072788962837L;

	public UserNotFoundException() {
		super();
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}
	
	public UserNotFoundException (Throwable cause) {
		super(cause);
	}
}
