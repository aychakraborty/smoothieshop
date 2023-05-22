package com.cs.smoothieshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.smoothieshop.handler.SmoothieCommonHandler;

/**
 * This is a Common Controller for Smoothie Application
 * 
 * @author Ayan, Chakraborty
 */
@CrossOrigin
@RestController
public class SmoothieCommonController {

	@Autowired
	SmoothieCommonHandler handler;

	/**
	 * This API returns a list of all existing smoothies in the database
	 * 
	 * @return ResponseEntity<List<String>>
	 */
	@GetMapping(value = "/common/smoothies")
	public ResponseEntity<List<String>> getAllSmoothies() {
		return new ResponseEntity<List<String>>(handler.getAllSmoothies(), HttpStatus.OK);
	}

}
