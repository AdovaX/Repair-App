package com.indocosmo.mmp.serviceImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indocosmo.mmp.model.Users;
import com.indocosmo.mmp.repository.CustomerRepository;
import com.indocosmo.mmp.service.CustomerService;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public void signUp(Users user) {
		
		customerRepository.save(user);
	}

	/*@Override
	public List<Customers> findAll() {
		
		return (List<Customers>) customerRepository.findAll();
	}*/

	@Override
	public void makeList() {
		
		Users cus=new Users("joshy","","","","","","","","joshy@gmail.com", "joshy", passwordEncoder.encode("123456"),"customer","male");
		customerRepository.save(cus);
		cus=new Users("midhun","","","","","","","","midhun@gmail.com", "midhun", passwordEncoder.encode("123456"),"customer","male");
		customerRepository.save(cus);
	}

}
