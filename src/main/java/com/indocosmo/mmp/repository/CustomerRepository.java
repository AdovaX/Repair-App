package com.indocosmo.mmp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.indocosmo.mmp.model.Users;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends CrudRepository<Users, Integer> {


	@Query(value = "SELECT * FROM users WHERE email = ?1", nativeQuery = true)
	Optional<Users> findByEmail(String email);

	@Query(value = "SELECT * FROM users WHERE email = ?1", nativeQuery = true)
	Users findByEmailId(String email);
}