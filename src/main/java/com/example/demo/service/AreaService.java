package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Area;
import com.example.demo.model.AreaResponse;

@Service
public class AreaService {

	public AreaResponse handleAreaValidation(Area objArea) {
		AreaResponse objAreaResponse = new AreaResponse();

		Integer areaofsquare;
		areaofsquare = calculateArea(objArea.getSide());
		objAreaResponse.setAreaofsquare(areaofsquare);
		Integer areaofrectangle;
		areaofrectangle = calculateArea(objArea.getLength(), objArea.getBreadth());
		objAreaResponse.setAreaofrectangle(areaofrectangle);
		Double areaoftriangle;
		areaoftriangle = calculateArea(0.5, objArea.getBase(), objArea.getHeight());
		objAreaResponse.setAreaoftriangle(areaoftriangle);
		return objAreaResponse;
	}

	public Integer calculateArea(Integer side) {
		Integer areaofsquare;
		areaofsquare = side * side;
		return areaofsquare;
	}

	public Integer calculateArea(Integer length, Integer breadth) {
		Integer areaofrectangle;
		areaofrectangle = length * breadth;
		return areaofrectangle;

	}

	public Double calculateArea(Double factor, Integer base, Integer height) {
		Double areaoftriangle;
		areaoftriangle = factor * base * height;
		return areaoftriangle;

	}
}
