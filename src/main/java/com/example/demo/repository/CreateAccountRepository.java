package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CreateAccount;

@Repository
public interface CreateAccountRepository extends JpaRepository<CreateAccount, Integer> {
	@Query(value="select * from conta where email = :email and password = :password", nativeQuery = true)
	public CreateAccount Login(String email, String password);
}
