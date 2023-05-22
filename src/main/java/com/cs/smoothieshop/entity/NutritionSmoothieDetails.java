package com.cs.smoothieshop.entity;

import javax.persistence.Embeddable;

/**
 * This is Embeddable Nutrition Smoothie Details Schema
 * 
 * @author Ayan, Chakraborty
 */
@Embeddable
public class NutritionSmoothieDetails {

	private Double calories;
	private Double fat;
	private Double cholesterol;
	private Double sodium;
	private Double potassium;
	private Double protein;

	/**
	 * @return the calories
	 */
	public Double getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	public void setCalories(Double calories) {
		this.calories = calories;
	}

	/**
	 * @return the fat
	 */
	public Double getFat() {
		return fat;
	}

	/**
	 * @param fat the fat to set
	 */
	public void setFat(Double fat) {
		this.fat = fat;
	}

	/**
	 * @return the cholesterol
	 */
	public Double getCholesterol() {
		return cholesterol;
	}

	/**
	 * @param cholesterol the cholesterol to set
	 */
	public void setCholesterol(Double cholesterol) {
		this.cholesterol = cholesterol;
	}

	/**
	 * @return the sodium
	 */
	public Double getSodium() {
		return sodium;
	}

	/**
	 * @param sodium the sodium to set
	 */
	public void setSodium(Double sodium) {
		this.sodium = sodium;
	}

	/**
	 * @return the potassium
	 */
	public Double getPotassium() {
		return potassium;
	}

	/**
	 * @param potassium the potassium to set
	 */
	public void setPotassium(Double potassium) {
		this.potassium = potassium;
	}

	/**
	 * @return the protein
	 */
	public Double getProtein() {
		return protein;
	}

	/**
	 * @param protein the protein to set
	 */
	public void setProtein(Double protein) {
		this.protein = protein;
	}

}
