package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Area;
import com.example.demo.model.AreaResponse;
import com.example.demo.model.Books;
import com.example.demo.model.BooksRequest;
import com.example.demo.model.BooksResponse;
import com.example.demo.model.MultipleBooksResponse;
import com.example.demo.service.AreaService;
import com.example.demo.service.BooksService;
import com.example.demo.service.MultipleBooksService;

import jakarta.validation.Valid;

@RestController
public class BooksController {
	private BooksService objBooksService;
	private MultipleBooksService objMultipleBooksService;
	private AreaService objAreaService;

	public BooksController(BooksService booksSer, MultipleBooksService multipleservice, AreaService areaservice) {
		objBooksService = booksSer;
		objMultipleBooksService = multipleservice;
		objAreaService = areaservice;
	}

	
	@PostMapping("/v1/books")
	public BooksResponse createBooks(@RequestBody Books books) {
		System.out.println("name is" + books.getName());
		System.out.println("author is" + books.getAuthor());
		System.out.println("yearOfPublication is" + books.getYearOfPublication());
		System.out.println("numberOfCopiesSold is" + books.getNumberofCopiesSold());
		BooksResponse objBooksResponse;
		objBooksResponse = objBooksService.handleBooksValidation(books);
		Books objBooks = new Books();
		objBooks.setName(books.getName());

		return objBooksResponse;

	}
	@GetMapping("/v1/books")
	public BooksResponse creategetBooks() {
		
		BooksResponse objBooksResponse;
		objBooksResponse = objBooksService.getBooks();
		

		return objBooksResponse;

	}

	@PostMapping("/v1/multiplebooks")
	public MultipleBooksResponse multipleBooks(@RequestBody BooksRequest booksRequest) {

		MultipleBooksResponse objMultipleBooksResponse;
		objMultipleBooksResponse = objMultipleBooksService.handleMultipleBooksValidation(booksRequest);

		return objMultipleBooksResponse;

	}
	
	
		
	@GetMapping("v1/multiplebooks")
	public MultipleBooksResponse getMultipleBooks(@RequestParam String strname ) {
		MultipleBooksResponse objMultipleBooksResponse;
		if(strname!=null)
		{
			objMultipleBooksResponse = objMultipleBooksService.getSingleBooks(strname);	
		}
		else
		{
			objMultipleBooksResponse = objMultipleBooksService.getMultipleBooks();	
		}
		
		return  objMultipleBooksResponse;

	}

	@PostMapping("/v1/area")
	public AreaResponse area(@Valid @RequestBody Area area) {
		System.out.println("side is" + area.getSide());
		System.out.println("length is" + area.getLength());
		System.out.println("breadth is" + area.getBreadth());
		System.out.println("base is" + area.getBase());
		System.out.println("height is" + area.getHeight());
		AreaResponse objAreaResponse;
		objAreaResponse = objAreaService.handleAreaValidation(area);
		return objAreaResponse;

	}

}
