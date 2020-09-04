package com.cg.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstore.repos.ShoppingCartRepository;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	@Autowired
	ShoppingCartRepository shoppingCartRepo;

}
