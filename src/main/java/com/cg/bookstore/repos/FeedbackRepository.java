package com.cg.bookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.models.Feedback;


public interface FeedbackRepository extends JpaRepository<Feedback, Long>{

}
