package com.kidsbuddy.mvc.rest.exception;

public class NoSuchWordException extends RuntimeException {
	private static final long serialVersionUID = -7447499723668070073L;

	public NoSuchWordException() {
		super();
	}
	
	public NoSuchWordException(String message) {
		super(message);
	}
	
	public NoSuchWordException(Throwable cause) {
		super(cause);
	}
}
