package com.cs.smoothieshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cs.smoothieshop.entity.Smoothie;
import com.cs.smoothieshop.handler.SmoothieUserHandler;

/**
 * This is a User Controller for Smoothie Application
 * 
 * @author Ayan, Chakraborty
 */
@CrossOrigin
@RestController
public class SmoothieUserController {

	@Autowired
	SmoothieUserHandler handler;

	/**
	 * This API return all the smoothies and the details
	 * 
	 * @return ResponseEntity<List<Smoothie>>
	 */
	@GetMapping(value = "/user/smoothieDetails")
	public ResponseEntity<List<Smoothie>> getAllSmoothieDetails() {
		return new ResponseEntity<List<Smoothie>>(handler.getAllSmoothieDetails(), HttpStatus.OK);
	}

	/**
	 * This API returns Total Cart cost for online order
	 * 
	 * @param names List<String>
	 * @return ResponseEntity<Double>
	 */
	@GetMapping(value = "/user/orderOnline")
	public ResponseEntity<Double> getTotalCartPrice(@RequestBody List<String> names) {
		return new ResponseEntity<Double>(handler.getTotalCartPrice(names), HttpStatus.OK);
	}

}
