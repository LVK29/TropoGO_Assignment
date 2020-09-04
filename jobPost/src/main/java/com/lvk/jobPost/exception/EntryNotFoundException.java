package com.lvk.jobPost.exception;

public class EntryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6261225294190133455L;

	public EntryNotFoundException(String message) {
		super(message);
	}

	public EntryNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
