package com.indocosmo.mmp.serviceImpl;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indocosmo.mmp.model.Users;
import com.indocosmo.mmp.repository.CustomerRepository;
import com.indocosmo.mmp.service.CustomerService;
import com.indocosmo.mmp.service.EmailSendService;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private EmailSendService emailSendService;
	
	
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
		
		Users cus=new Users("joshy","","","","","","","","joshy.p@indocosmo.in", "joshy", passwordEncoder.encode("123456"),"customer","male",UUID.randomUUID().toString(),new Date(),0);
		cus=customerRepository.save(cus);
		emailSendService.sendConfirmationToken(cus.getEmail(),cus.getToken());
		
		Users cus2=new Users("midhun","","","","","","","","midhun@gmail.com", "midhun", passwordEncoder.encode("123456"),"customer","male",UUID.randomUUID().toString(),new Date(),0);
		cus2=customerRepository.save(cus2);
		emailSendService.sendConfirmationToken(cus2.getEmail(),cus2.getToken());
	}

	@Override
	public Optional<Users> getUserByEmail(String currentUserEmail) {
		
		try {
			return customerRepository.findByEmail(currentUserEmail);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void resendVerificationEmail(Users customer) {
		
		
		customer.setToken(UUID.randomUUID().toString());
		customer.setTokenDateTime(new Date());
		customerRepository.save(customer);
		emailSendService.sendConfirmationToken(customer.getEmail(),customer.getToken());
		
	}

}
