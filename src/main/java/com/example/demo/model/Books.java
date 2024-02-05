package com.example.demo.model;

public class Books {
	private String name;
	private String author;
	private Integer yearOfPublication;
	private Integer numberofCopiesSold;

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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the yearOfPublication
	 */
	public Integer getYearOfPublication() {
		return yearOfPublication;
	}

	/**
	 * @param yearOfPublication the yearOfPublication to set
	 */
	public void setYearOfPublication(Integer yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	/**
	 * @return the numberofCopiesSold
	 */
	public Integer getNumberofCopiesSold() {
		return numberofCopiesSold;
	}

	/**
	 * @param numberofCopiesSold the numberofCopiesSold to set
	 */
	public void setNumberofCopiesSold(Integer numberofCopiesSold) {
		this.numberofCopiesSold = numberofCopiesSold;
	}

}
