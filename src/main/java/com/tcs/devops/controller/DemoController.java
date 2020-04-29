package com.tcs.devops.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/devops")
public class DemoController {

	@RequestMapping(value = "/health")
	public ResponseEntity<String> health() {
		return ResponseEntity.ok("SUCCESS-200");
	}
}
