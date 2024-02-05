package com.example.demo.model;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Fruits {
	@NotBlank(message = "name is required")
private String name;
	@NotBlank(message = "colour is required")
private String colour;
	@NotNull(message = " numberoffruitspurchase is required")
private Integer numberoffruitspurchase;
	@NotNull(message = " weight is required")
private Double weight;
	@NotNull(message = "dateofpurchase is required")
private Date dateofpurchase;
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
public Date getDateofpurchase() {
	return dateofpurchase;
}
public void setDateofpurchase(Date dateofpurchase) {
	this.dateofpurchase = dateofpurchase;
}

}
