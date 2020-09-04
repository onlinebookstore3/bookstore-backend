package com.cg.bookstore.services;

import java.util.List;

import com.cg.bookstore.models.BookDetails;
import com.cg.bookstore.models.User;

public interface BookDetailsService {
	
	public List<BookDetails> getBooks();

}
