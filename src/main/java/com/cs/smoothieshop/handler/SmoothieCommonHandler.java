package com.cs.smoothieshop.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.smoothieshop.entity.Smoothie;
import com.cs.smoothieshop.repository.SmoothieDao;

/**
 * This is Common Service class
 * 
 * @author Ayan, Chakraborty
 */
@Service
public class SmoothieCommonHandler {

	@Autowired
	SmoothieDao dao;

	/**
	 * This method fetches all Smoothie names
	 * 
	 * @return List<String>
	 */
	public List<String> getAllSmoothies() {
		List<String> smoothies = new ArrayList<String>();
		dao.findAll().forEach(smoothie -> {
			smoothies.add(smoothie.getName());
		});
		return smoothies;
	}

}
