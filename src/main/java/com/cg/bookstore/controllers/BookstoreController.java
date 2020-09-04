package com.cg.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstore.models.BookDetails;
import com.cg.bookstore.models.User;
import com.cg.bookstore.services.BookDetailsService;
import com.cg.bookstore.services.FeedbackService;
import com.cg.bookstore.services.OrderDetailsService;
import com.cg.bookstore.services.PaymentDetailsService;
import com.cg.bookstore.services.ShoppingCartService;
import com.cg.bookstore.services.UserService;


@CrossOrigin
@RestController
public class BookstoreController {
	@Autowired
	UserService userService;
	@Autowired
	OrderDetailsService orderDetailsService;
	
	
	  @Autowired 
	  ShoppingCartService shoppingCartService;
	  
	  @Autowired 
	  PaymentDetailsService paymentDetailsService;
	  
	  @Autowired 
	  FeedbackService feedbackService;
	 
	  
	  @Autowired 
	  BookDetailsService bookDetailsService;
	 
	 
	
	
	@RequestMapping("/users")
	private ResponseEntity<List<User>> getAllUsers(){
		List<User> u = userService.getUsers();
		return new ResponseEntity<List<User>>(u ,HttpStatus.OK);
	}
	
	@RequestMapping("/books")
	private ResponseEntity<List<BookDetails>> getAllBooks(){
		List<BookDetails> book = bookDetailsService.getBooks();
		return new ResponseEntity<List<BookDetails>>(book ,HttpStatus.OK);
	}

}
