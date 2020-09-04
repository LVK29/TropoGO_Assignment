package com.lvk.jobPost.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.lvk.jobPost.model.ErrorMessage;

/*
 * Class is for exception handling entry not found
 */
@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8891959764862530715L;

	@ExceptionHandler(EntryNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleEntryNotFoundException(EntryNotFoundException ex, WebRequest webRequest) {
		// create payload containing exception details
		ErrorMessage errMsg = new ErrorMessage(ex.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now());
		// return response entry

		return new ResponseEntity<ErrorMessage>(errMsg, new HttpHeaders(), HttpStatus.BAD_REQUEST);

	}
}