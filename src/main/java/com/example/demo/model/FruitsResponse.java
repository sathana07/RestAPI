package com.example.demo.model;

import java.time.LocalDate;

public class FruitsResponse {
	private String name;
	private String colour;
	private Integer numberoffruitspurchase;
	private Double weight;
	private LocalDate dateofpurchase;
	private Boolean valid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Integer getNumberoffruitspurchase() {
		return numberoffruitspurchase;
	}
	public void setNumberoffruitspurchase(Integer numberoffruitspurchase) {
		this.numberoffruitspurchase = numberoffruitspurchase;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public LocalDate getDateofpurchase() {
		return dateofpurchase;
	}
	public void setDateofpurchase(LocalDate dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
		
	}
	
	
		
	}


