package com.cg.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstore.repos.PaymentDetailsRepository;


@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService{

	@Autowired
	PaymentDetailsRepository paymentDetailsRepo;
}
