package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.model.BooksResponse;





@Service
public class BooksService {

	public BooksResponse handleBooksValidation(Books objBooks) {
		BooksResponse objbookResponse = new 	BooksResponse();
		objbookResponse.setName(objBooks.getName());
		objbookResponse.setAuthor(objBooks.getAuthor());
		objbookResponse.setNumberofCopiesSold(objBooks.getNumberofCopiesSold());
		objbookResponse.setYearOfPublication(objBooks.getYearOfPublication());
		if (objBooks.getNumberofCopiesSold() > 100) {
			System.out.println("ValidBook");
			objbookResponse.setValid(true);
		} else {
			System.out.println("invalid user");
			objbookResponse.setValid(false);
		}

		return objbookResponse;
	}
	public BooksResponse getBooks() {
		BooksResponse objbookResponse = new 	BooksResponse();
		objbookResponse.setName("sathana");
		objbookResponse.setAuthor("sathana");
		objbookResponse.setNumberofCopiesSold(10);
		objbookResponse.setYearOfPublication(2001);
		

		return objbookResponse;
	}
}
