package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Fruits;
import com.example.demo.model.FruitsResponse;
@Service
public class FruitsService {
 public FruitsResponse handleFruitsValidation(Fruits objFruits) {
	 FruitsResponse objFruitsResponse=new FruitsResponse();
	 objFruitsResponse.setName(objFruits.getName());
	 objFruitsResponse.setColour(objFruits.getColour());
	 objFruitsResponse.setNumberoffruitspurchase(objFruits.getNumberoffruitspurchase());
	 objFruitsResponse.setWeight(objFruits.getWeight());
	
	
	 if(objFruits.getColour().equalsIgnoreCase("yellow")&& objFruits.getNumberoffruitspurchase()>3) {
		 System.out.println("the fruit is yellow and the number of fruits purchased is > 3");
		 objFruitsResponse.setValid(true);
	 }
	 else
	 {
		 System.out.println("the fruit is not yellow and the number of fruits purchased is not > 3");
		 objFruitsResponse.setValid(false);
	 }
	return objFruitsResponse;
}
}
