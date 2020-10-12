package com.indocosmo.mmp.serviceImpl;


import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indocosmo.mmp.model.Users;
import com.indocosmo.mmp.repository.CustomerRepository;
import com.indocosmo.mmp.service.CustomerService;
import com.indocosmo.mmp.service.EmailSendService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;


@Service
@Transactional
public class EmailSendServiceImpl implements EmailSendService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private EmailSendService emailSendService;

	private JavaMailSender javaMailSender;	
	@Autowired
	public EmailSendServiceImpl(JavaMailSender javaMailSender) {
    this.javaMailSender = javaMailSender;
	}
	 
	
	@Override
	public void sendConfirmationToken(String email,String token) {
		
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(email);
		mailMessage.setSubject("Complete Registration!");
		mailMessage.setFrom("mmp.savan12@gmail.com");
		mailMessage.setText("To confirm your account, please click here : "
		+"http://localhost:8080/confirm-account?token="+token);
		
		sendEmail(mailMessage);
		System.out.println("sent mail to"+email);
		
	}
	
	  
	  @Async
	  public void sendEmail(SimpleMailMessage email) {
		  javaMailSender.send(email);
	  }
	

}
