package com.cs.smoothieshop.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is SMOOTHIE Table Schema
 * 
 * @author Ayan, Chakraborty
 */
@Entity
public class Smoothie {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	private String name;
	@Embedded
	private BasicSmoothieDetails basicSmoothieDetails;
	@Embedded
	private NutritionSmoothieDetails nutritionSmoothieDetails;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the basicSmoothieDetails
	 */
	public BasicSmoothieDetails getBasicSmoothieDetails() {
		return basicSmoothieDetails;
	}

	/**
	 * @param basicSmoothieDetails the basicSmoothieDetails to set
	 */
	public void setBasicSmoothieDetails(BasicSmoothieDetails basicSmoothieDetails) {
		this.basicSmoothieDetails = basicSmoothieDetails;
	}

	/**
	 * @return the nutritionSmoothieDetails
	 */
	public NutritionSmoothieDetails getNutritionSmoothieDetails() {
		return nutritionSmoothieDetails;
	}

	/**
	 * @param nutritionSmoothieDetails the nutritionSmoothieDetails to set
	 */
	public void setNutritionSmoothieDetails(NutritionSmoothieDetails nutritionSmoothieDetails) {
		this.nutritionSmoothieDetails = nutritionSmoothieDetails;
	}

}