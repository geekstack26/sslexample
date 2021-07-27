package com.geekstack.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {

	@GetMapping("/students.name")
	public ResponseEntity<List<String>> studentList() {
		return new ResponseEntity<List<String>>(getStudentNames(), HttpStatus.OK);
	}

	private List<String> getStudentNames() {
		List<String> sn = new ArrayList<>();
		sn.add("Deepak");
		sn.add("Sibasish");
		sn.add("Rakesh");
		sn.add("Amit");
		sn.add("Debasish");
		return sn;
	}
}
