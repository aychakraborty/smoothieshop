package com.cs.smoothieshop.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.smoothieshop.entity.Smoothie;
import com.cs.smoothieshop.repository.SmoothieDao;

/**
 * This is User Service class
 * 
 * @author Ayan, Chakraborty
 */
@Service
public class SmoothieUserHandler {

	@Autowired
	SmoothieDao dao;

	/**
	 * This method fetches all Smoothie and it's details
	 * 
	 * @return List<Smoothie>
	 */
	public List<Smoothie> getAllSmoothieDetails() {
		return (List<Smoothie>) dao.findAll();
	}

	/**
	 * This method calculates Total Cart Price for selected smoothies
	 * 
	 * @param names List<String>
	 * @return Double
	 */
	public Double getTotalCartPrice(List<String> names) {
		List<Smoothie> smoothieList = (List<Smoothie>) dao.findAll();
		Double totalCartPrice = 0.0;
		for (Smoothie smoothie : smoothieList) {
			if (names.contains(smoothie.getName())) {
				totalCartPrice += smoothie.getBasicSmoothieDetails().getPrice();
			}
		}
		return totalCartPrice;
	}

}
