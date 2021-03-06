package com.indocosmo.mmp.service;

import java.util.List;
import java.util.Optional;

import com.indocosmo.mmp.model.Users;



public interface CustomerService {

	void signUp(Users customer);
	/*List<Customers> findAll();*/
	void makeList();
	Optional <Users>  getUserByEmail(String currentUserEmail);

	

		Optional<Users> findByEmail(String email);

	void resendVerificationEmail(Users users);
	String verifyAccount(String confirmationToken);
}
