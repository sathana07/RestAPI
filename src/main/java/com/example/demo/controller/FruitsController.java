package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Fruits;
import com.example.demo.model.FruitsRequest;
import com.example.demo.model.FruitsResponse;

import com.example.demo.model.MultipleFruitsResponse;
import com.example.demo.service.FruitsService;

import com.example.demo.service.MultipleFruitsService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FruitsController {
	private FruitsService objFruitsService;
	private MultipleFruitsService objMultipleFruitsService;

	public FruitsController(FruitsService fruitsservice, MultipleFruitsService multipleFruitsService) {
		objFruitsService = fruitsservice;
		objMultipleFruitsService = multipleFruitsService;
	}

	@PostMapping("/v1/fruits")
	public FruitsResponse createfruits(@Valid @RequestBody Fruits fruits) {
		System.out.println("name is" + fruits.getName());
		System.out.println("colour is" + fruits.getColour());
		System.out.println("numberoffruitspurchase is" + fruits.getNumberoffruitspurchase());
		System.out.println("weight is" + fruits.getWeight());
		System.out.println("dateofpurchase is" + fruits.getDateofpurchase());
		FruitsResponse objFruitsResponse;
		objFruitsResponse = objFruitsService.handleFruitsValidation(fruits);
		Fruits objFruits = new Fruits();
		objFruits.setName(fruits.getName());
		return objFruitsResponse;
	}

	@PostMapping("/v1/multiplefruits")
	public MultipleFruitsResponse multipleFruits(@Valid @RequestBody FruitsRequest fruitsrequest) {

		MultipleFruitsResponse objMultipleFruitsResponse;
		objMultipleFruitsResponse = objMultipleFruitsService.handleMultipleFruitsvalidation(fruitsrequest);

		return objMultipleFruitsResponse;

	}

	@GetMapping("/v1/multiplefruits1")
	public MultipleFruitsResponse multipleFruits() {

		MultipleFruitsResponse objMultipleFruitsResponse;
		objMultipleFruitsResponse = objMultipleFruitsService.getMultipleFruits();

		return objMultipleFruitsResponse;

	}

	@GetMapping("/v1/multiplefruits")
	public MultipleFruitsResponse getSingleFruits(@Valid @RequestParam String strname) {
		MultipleFruitsResponse objMultipleFruitsResponse;
		if (strname != null) {
			objMultipleFruitsResponse = objMultipleFruitsService.getSingleFruits(strname);
		} else {
			objMultipleFruitsResponse = objMultipleFruitsService.getMultipleFruits();
		}
		return objMultipleFruitsResponse;

	}

}
