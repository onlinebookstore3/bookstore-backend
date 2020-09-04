package com.cg.bookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.models.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Long>{

}
