package com.cs.smoothieshop.handler;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.smoothieshop.entity.Smoothie;
import com.cs.smoothieshop.repository.SmoothieDao;

/**
 * This is Business Service class
 * 
 * @author Ayan, Chakraborty
 */
@Service
public class SmoothieBusinessHandler {

	@Autowired
	SmoothieDao dao;

	/**
	 * This method fetches particular smoothie details
	 * 
	 * @param name String
	 * @return Smoothie
	 */
	public Smoothie getSmoothieDetails(String name) {
		List<Smoothie> smoothieList = (List<Smoothie>) dao.findAll();
		return smoothieList.stream().filter(smoothie -> smoothie.getName().equalsIgnoreCase(name)).findAny()
				.orElse(null);
	}
	
	/**
	 * This method is used to insert new Smoothie details
	 * 
	 * @param smoothie Smoothie
	 */
	public void insertSmoothieDetails(Smoothie smoothie) {
		dao.save(smoothie);
	}
	
	/**
	 * This method is used to insert multiple Smoothie details
	 * 
	 * @param smoothie List<Smoothie>
	 */
	public void insertMultipleSmoothieDetails(List<Smoothie> smoothies) {
		dao.saveAll(smoothies);
	}

	/**
	 * This method is used to edit particular Smoothie details
	 * 
	 * @param smoothie Smoothie
	 */
	public void editSmoothieDetails(Smoothie smoothie) {
		if (dao.existsById(smoothie.getId())) {
			dao.save(smoothie);
		} else {
			throw new RuntimeException("The smoothie details do not exist!");
		}
	}

	/**
	 * This method is used to delete particular smoothie and it's details
	 * 
	 * @param name String
	 */
	public void deleteSmoothieDetails(String name) {
		List<Smoothie> smoothieList = (List<Smoothie>) dao.findAll();
		Smoothie smoothie = smoothieList.stream().filter(s -> s.getName().equalsIgnoreCase(name)).findAny()
				.orElse(null);
		if(Objects.isNull(smoothie)) {
			throw new RuntimeException("Nothing to delete as it does not exist!");
		}
		dao.delete(smoothie);
	}

}
