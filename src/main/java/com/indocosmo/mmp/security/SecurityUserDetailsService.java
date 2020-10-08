package com.indocosmo.mmp.security;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.indocosmo.mmp.model.Users;
import com.indocosmo.mmp.repository.CustomerRepository;

import org.springframework.stereotype.Component;

@Component
public class SecurityUserDetailsService implements UserDetailsService{

	@Autowired 
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users customer=customerRepository.findByUsername(username);
		
		if(customer == null) {
	      throw new UsernameNotFoundException("User not found");
	    }
		
		List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(customer.getRole()));
		
	    return new User(customer.getUsername(), customer.getPassword(), authorities);
	}

}
