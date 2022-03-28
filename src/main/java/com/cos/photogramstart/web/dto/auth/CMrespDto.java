package com.cos.photogramstart.web.dto.auth;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CMrespDto<T> {

	private int code;		//1 은 성공 		-1은 실패
	private String message;
	private T data;
	
}
