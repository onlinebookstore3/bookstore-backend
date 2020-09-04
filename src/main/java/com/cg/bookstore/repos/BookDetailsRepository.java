package com.cg.bookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.models.BookDetails;

public interface BookDetailsRepository extends JpaRepository<BookDetails, Long>{

}
