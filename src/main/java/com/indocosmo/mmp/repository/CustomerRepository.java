package com.indocosmo.mmp.repository;

import org.springframework.data.repository.CrudRepository;


import com.indocosmo.mmp.model.Users;







// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends CrudRepository<Users, Integer> {

	Users findByUsername(String username);

	

	

}