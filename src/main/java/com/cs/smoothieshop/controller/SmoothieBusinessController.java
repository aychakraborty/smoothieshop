package com.cs.smoothieshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cs.smoothieshop.entity.Smoothie;
import com.cs.smoothieshop.handler.SmoothieBusinessHandler;

/**
 * This is a Business Controller for Smoothie Application
 * 
 * @author Ayan, Chakraborty
 */
@CrossOrigin
@RestController
public class SmoothieBusinessController {

	@Autowired
	SmoothieBusinessHandler handler;

	/**
	 * This API returns details of particular smoothies
	 * 
	 * @param name String
	 * @return ResponseEntity<Smoothie>
	 */
	@GetMapping("/business/{name}")
	public ResponseEntity<Smoothie> getSmoothieDetails(@PathVariable("name") String name) {
		return new ResponseEntity<Smoothie>(handler.getSmoothieDetails(name), HttpStatus.OK);
	}

	/**
	 * This API is used to edit particular smoothie details
	 * 
	 * @param smoothie Smoothie
	 * @return ResponseEntity
	 */
	@PutMapping("/business/editSmoothieDetails")
	public ResponseEntity<Void> editSmoothieDetails(@RequestBody Smoothie smoothie) {
		handler.editSmoothieDetails(smoothie);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	/**
	 * This API is used to delete particular smoothie
	 * 
	 * @param name String
	 * @return ResponseEntity
	 */
	@DeleteMapping("business/deleteSmoothie/{name}")
	public ResponseEntity<Void> deleteSmoothieDetails(@PathVariable("name") String name) {
		handler.deleteSmoothieDetails(name);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
