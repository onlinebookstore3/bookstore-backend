package com.cg.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstore.repos.BookDetailsRepository;
import com.cg.bookstore.repos.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	@Autowired
	FeedbackRepository feedbackRepo;

}
