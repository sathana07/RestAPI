package com.example.demo.model;


import jakarta.validation.constraints.NotNull;

public class Area {
	@NotNull(message = "side is required")

	private Integer side;
	@NotNull(message = "length is required")
	private Integer length;

	@NotNull(message = "breadth is required")
	private Integer breadth;
	@NotNull(message = "base is required")
	private Integer base;
	@NotNull(message = "height is required")
	private Integer height;

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getBreadth() {
		return breadth;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}

	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}
}
