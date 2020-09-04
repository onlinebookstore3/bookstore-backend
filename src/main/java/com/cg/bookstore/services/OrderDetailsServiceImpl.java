package com.cg.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstore.models.OrderDetails;
import com.cg.bookstore.repos.OrderdetailsRepository;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{
	
	@Autowired
	OrderdetailsRepository OrderdetailsRepo;

	
}
