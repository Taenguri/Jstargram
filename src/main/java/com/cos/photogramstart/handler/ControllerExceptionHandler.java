package com.cos.photogramstart.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.photogramstart.handler.ex.CustomValidationException;
import com.cos.photogramstart.util.Script;
import com.cos.photogramstart.web.dto.auth.CMrespDto;

@RestController
@ControllerAdvice
public class ControllerExceptionHandler {

	
	@ExceptionHandler(CustomValidationException.class)
	public String validationException(CustomValidationException e) {
		return Script.back(e.getErrorMap().toString());
	}
		
}

//	@ExceptionHandler(CustomValidationException.class)
//	public CMrespDto<?> validationException(CustomValidationException e) {
//		return new CMrespDto<Map<String,String>>(-1,e.getMessage(), e.getErrorMap());
//	}