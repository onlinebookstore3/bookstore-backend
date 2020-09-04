package com.cg.bookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.models.OrderDetails;


public interface OrderdetailsRepository extends JpaRepository<OrderDetails, Long>{

}
