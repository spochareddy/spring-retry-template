package com.sindalah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sindalah.service.ServiceAdapter;

@RestController
@RequestMapping("/api/v1")
public class ResourceController {

	@Autowired
	private ServiceAdapter serviceAdapter;

	@GetMapping("/retryable-operation")
	public ResponseEntity<String> validateSpringRetryCapability() {

		String apiResponse = serviceAdapter.getBackendResponse();
		return ResponseEntity.ok().body(apiResponse);
	}
}
