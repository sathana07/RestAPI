package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.model.BooksRequest;
import com.example.demo.model.BooksResponse;
import com.example.demo.model.MultipleBooksResponse;

@Service
public class MultipleBooksService {

	public MultipleBooksResponse handleMultipleBooksValidation(BooksRequest objBookRequest) {
		MultipleBooksResponse objMultipleBooksResponse = new MultipleBooksResponse();
		List<BooksResponse> lstBooksResponses = new ArrayList<BooksResponse>();

		List<Books> lstBooks = objBookRequest.getBooks();
		for (Books books : lstBooks) {
			BooksResponse objBookResponse = new BooksResponse();
			// String strname = books.getName();
			// System.out.println(strname);
			if (books.getNumberofCopiesSold() > 100) {
				objBookResponse.setName(books.getName());
				objBookResponse.setAuthor(books.getAuthor());
				objBookResponse.setNumberofCopiesSold(books.getNumberofCopiesSold());
				objBookResponse.setYearOfPublication(books.getYearOfPublication());
				objBookResponse.setValid(true);
				System.out.println("valid book");
			} else {
				objBookResponse.setName(books.getName());
				objBookResponse.setAuthor(books.getAuthor());
				objBookResponse.setNumberofCopiesSold(books.getNumberofCopiesSold());
				objBookResponse.setYearOfPublication(books.getYearOfPublication());
				objBookResponse.setValid(false);
				System.out.println("invalid book");
			}
			lstBooksResponses.add(objBookResponse);
			// System.out.println(books.getNumberofCopiesSold());
		}
		objMultipleBooksResponse.setBooksResponse(lstBooksResponses);
		/*
		 * BooksResponse objMultiplebookResponse = new BooksResponse();
		 * objMultiplebookResponse.setAuthor(objMultiplebookResponse.getName());
		 * objMultiplebookResponse.setAuthor(objMultiplebookResponse.getAuthor());
		 * objMultiplebookResponse.setNumberofCopiesSold(objMultiplebookResponse.
		 * getNumberofCopiesSold());
		 * objMultiplebookResponse.setYearOfPublication(objMultiplebookResponse.
		 * getYearOfPublication()); if (objMultiplebookResponse.getNumberofCopiesSold()
		 * > 100) { System.out.println("ValidBook");
		 * objMultiplebookResponse.setValid(true); } else {
		 * System.out.println("invalid book "); objMultiplebookResponse.setValid(false);
		 * }
		 */

		return objMultipleBooksResponse;

	}

	public MultipleBooksResponse getMultipleBooks() {
		MultipleBooksResponse objMultipleBooksResponse = new MultipleBooksResponse();
		List<BooksResponse> lstBooksResponse = prepareBooksList();

		objMultipleBooksResponse.setBooksResponse(lstBooksResponse);
		return objMultipleBooksResponse;

	}

	private List<BooksResponse> prepareBooksList() {
		List<BooksResponse> lstBooksResponse = new ArrayList<BooksResponse>();

		BooksResponse objBookResponse1 = new BooksResponse();
		objBookResponse1.setName("sathana");
		objBookResponse1.setAuthor("sana");
		objBookResponse1.setNumberofCopiesSold(7);
		objBookResponse1.setYearOfPublication(2003);
		lstBooksResponse.add(objBookResponse1);

		BooksResponse objBookResponse2 = new BooksResponse();
		objBookResponse2.setName("swarna");
		objBookResponse2.setAuthor("swarna");
		objBookResponse2.setNumberofCopiesSold(70);
		objBookResponse2.setYearOfPublication(2005);
		lstBooksResponse.add(objBookResponse2);
		return lstBooksResponse;
	}

	public MultipleBooksResponse getSingleBooks(String strname) {
		MultipleBooksResponse objMultipleBooksResponse = new MultipleBooksResponse();

		List<BooksResponse> lstBooksResponse = prepareBooksList();
		// create newlist
		List<BooksResponse> newBooksResponses = new ArrayList<BooksResponse>();
		// iterate list get name matched bookresponse.add to new lst .set new lst in multipleresponse
		for (BooksResponse booksResponse : lstBooksResponse) {
			if (booksResponse.getName().equals(strname)) 
			
				newBooksResponses .add(booksResponse);
			} 
		objMultipleBooksResponse.setBooksResponse(newBooksResponses);

		

		return objMultipleBooksResponse;
	}
}
