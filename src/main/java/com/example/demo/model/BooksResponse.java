package com.example.demo.model;

public class BooksResponse {
	private String name;
	private String author;
	private Integer yearOfPublication;
	private Integer numberofCopiesSold;
	private boolean valid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(Integer yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public Integer getNumberofCopiesSold() {
		return numberofCopiesSold;
	}
	public void setNumberofCopiesSold(Integer numberofCopiesSold) {
		this.numberofCopiesSold = numberofCopiesSold;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}