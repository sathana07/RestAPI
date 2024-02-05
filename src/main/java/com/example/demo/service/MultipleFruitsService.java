package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import com.example.demo.model.Fruits;
import com.example.demo.model.FruitsRequest;
import com.example.demo.model.FruitsResponse;

import com.example.demo.model.MultipleFruitsResponse;

@Service
public class MultipleFruitsService {

	@Value("${Fruits.colour}")
	private String fruitcolour;

	@Value("${Fruits.name}")
	private String fruitname;

	public MultipleFruitsResponse handleMultipleFruitsvalidation(FruitsRequest objFruitsRequest) {
		MultipleFruitsResponse objMultipleFruitsResponse = new MultipleFruitsResponse();
		List<FruitsResponse> lstFruitsResponse = new ArrayList<FruitsResponse>();

		List<Fruits> lstFruits = objFruitsRequest.getFruits();
		for (Fruits fruits : lstFruits) {
			FruitsResponse objFruitsResponse = new FruitsResponse();
			if (fruits.getColour().equalsIgnoreCase(fruitcolour) && fruits.getNumberoffruitspurchase() > 3) {
				objFruitsResponse.setName(fruits.getName());
				objFruitsResponse.setColour(fruits.getColour());
				objFruitsResponse.setNumberoffruitspurchase(fruits.getNumberoffruitspurchase());
				objFruitsResponse.setWeight(fruits.getWeight());
				objFruitsResponse.setDateofpurchase(LocalDate.of(2024, 2, 2));

				objFruitsResponse.setValid(true);
				System.out.println("valid fruits");
			} else {
				objFruitsResponse.setName(fruits.getName());
				objFruitsResponse.setColour(fruits.getColour());
				objFruitsResponse.setNumberoffruitspurchase(fruits.getNumberoffruitspurchase());
				objFruitsResponse.setWeight(fruits.getWeight());
				objFruitsResponse.setDateofpurchase(LocalDate.of(2024, 2, 2));
				objFruitsResponse.setValid(false);
				System.out.println("invalid fruits");
			}
			lstFruitsResponse.add(objFruitsResponse);
		}
		objMultipleFruitsResponse.setFruitsresponse(lstFruitsResponse);
		return objMultipleFruitsResponse;

	}

	/*
	 * //single fruits public MultipleFruitsResponse getSingleFruits(String strname)
	 * { MultipleFruitsResponse objMultipleFruitsResponse = new
	 * MultipleFruitsResponse();
	 * 
	 * 
	 * 
	 * List<FruitsResponse> newFruitsResponses = new ArrayList<FruitsResponse>();
	 * 
	 * for (FruitsResponse fruitsResponse : newFruitsResponses) {
	 * 
	 * 
	 * 
	 * if (fruitsResponse.getName().equals(strname))
	 * 
	 * newFruitsResponses .add(fruitsResponse); }
	 * objMultipleFruitsResponse.setFruitsresponse(newFruitsResponses); return
	 * objMultipleFruitsResponse; }
	 */
	public MultipleFruitsResponse getMultipleFruits() {
		MultipleFruitsResponse objMultipleFruitsResponse = new MultipleFruitsResponse();
		List<FruitsResponse> lstFruitsResponses = preparelist();

		objMultipleFruitsResponse.setFruitsresponse(lstFruitsResponses);
		return objMultipleFruitsResponse;
	}

	private List<FruitsResponse> preparelist() {
		List<FruitsResponse> lstFruitsResponses = new ArrayList<FruitsResponse>();

		FruitsResponse objFruitsResponse = new FruitsResponse();
		objFruitsResponse.setName("apple");
		objFruitsResponse.setColour("yellow");
		objFruitsResponse.setNumberoffruitspurchase(4);
		objFruitsResponse.setWeight(2.1);
		objFruitsResponse.setDateofpurchase(LocalDate.now());
		objFruitsResponse.setValid(true);
		lstFruitsResponses.add(objFruitsResponse);

		FruitsResponse objFruitsResponse1 = new FruitsResponse();
		objFruitsResponse1.setName("mango");
		objFruitsResponse1.setColour("yellow");
		objFruitsResponse1.setNumberoffruitspurchase(4);
		objFruitsResponse1.setWeight(2.1);
		objFruitsResponse1.setDateofpurchase(LocalDate.now());
		objFruitsResponse.setValid(false);
		lstFruitsResponses.add(objFruitsResponse1);
		return lstFruitsResponses;
	}

	
	public MultipleFruitsResponse getSingleFruits(String strname) {
	    MultipleFruitsResponse objMultipleFruitsResponse = new MultipleFruitsResponse();
	    
	    List<FruitsResponse> lstFruitsResponses = new ArrayList<FruitsResponse>();

	    FruitsResponse objFruitsResponse2 = new FruitsResponse();
	    objFruitsResponse2.setName("apple");
	    objFruitsResponse2.setColour("yellow");
	    objFruitsResponse2.setNumberoffruitspurchase(4);
	    objFruitsResponse2.setWeight(2.1);
	    objFruitsResponse2.setDateofpurchase(LocalDate.now());
	    objFruitsResponse2.setValid(true);
	    lstFruitsResponses.add(objFruitsResponse2);

	    FruitsResponse objFruitsResponse3 = new FruitsResponse();
	    objFruitsResponse3.setName("mango");
	    objFruitsResponse3.setColour("yellow");
	    objFruitsResponse3.setNumberoffruitspurchase(8);
	    objFruitsResponse3.setWeight(5.0);
	    objFruitsResponse3.setDateofpurchase(LocalDate.now());
	    objFruitsResponse3.setValid(false);
	    lstFruitsResponses.add(objFruitsResponse3);

	    List<FruitsResponse> newFruitsResponses = new ArrayList<FruitsResponse>();

	    for (FruitsResponse fruitsResponse : lstFruitsResponses) {
	        if (fruitsResponse.getName().equals(strname)) {
	            newFruitsResponses.add(fruitsResponse);
	        }
	    }

	    objMultipleFruitsResponse.setFruitsresponse(newFruitsResponses);

	    return objMultipleFruitsResponse;
	}

		
	
}
