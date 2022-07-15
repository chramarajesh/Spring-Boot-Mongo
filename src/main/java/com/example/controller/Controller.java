package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.repo.BookRepository;

@RestController
public class Controller {
	
	@Autowired
	private BookRepository repo;
	
	@PostMapping("/save")
     public ResponseEntity<String> save(@RequestBody Book book){
		
		System.out.println("Hello I am in post mapping save method..");
     repo.save(book);
	
	return new ResponseEntity<String>("Object created", HttpStatus.OK);
	}
}
