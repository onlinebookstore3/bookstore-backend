package com.cg.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.bookstore.models.BookDetails;
import com.cg.bookstore.repos.BookDetailsRepository;

@Service
public class BookDetailsServiceImpl implements BookDetailsService{
	@Autowired
	BookDetailsRepository bookDetailsRepo;

	@Override
	public List<BookDetails> getBooks() {
		// TODO Auto-generated method stub
		return bookDetailsRepo.findAll();
	}
	
}
