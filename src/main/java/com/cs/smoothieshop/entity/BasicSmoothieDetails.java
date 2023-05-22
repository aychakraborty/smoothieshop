package com.cs.smoothieshop.entity;

import javax.persistence.Embeddable;

/**
 * This is Embeddable Basic Smoothie Details Schema
 * 
 * @author Ayan, Chakraborty
 */
@Embeddable
public class BasicSmoothieDetails {

	private String description;
	private String ingredients;
	private Double price;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the ingredients
	 */
	public String getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

}
