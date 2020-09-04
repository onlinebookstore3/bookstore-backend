package com.cg.bookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
