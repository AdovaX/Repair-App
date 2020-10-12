package com.indocosmo.mmp.controller;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.indocosmo.mmp.dto.ResponseDTO;
import com.indocosmo.mmp.model.Users;
import com.indocosmo.mmp.repository.CustomerRepository;
import com.indocosmo.mmp.security.SecurityUtils;
import com.indocosmo.mmp.service.CustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService studentService;
	
	@Autowired
	private CustomerService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private CustomerRepository customerRepository ;
	
	
	@RequestMapping(value="/")
	public String indexPage() {
		
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		
		return "login";
	}
	//test
	@RequestMapping(value="/login2")
	public String login2() {
		
		return "login2";
	}
	
	@RequestMapping(value="/adminHome")
	public String getAdminHome() {
		
		return "adminHome";
	}
	
	@RequestMapping(value="/userHome")
	public String getUserHome() {
		
		return "userHome";
	}
	
	@RequestMapping(value="/customerHome")
	public String getCustomerHome() {
		
		Optional<Users> user=customerRepository.findByEmail(SecurityUtils.getCurrentUserLogin());
		if (user.isPresent()) {
			if (user.get().getIsVerified()==1) {
				return "customerHome";
			}else {
				return "notVerified";
			}
		}else {
			return null;
		}
	}
	

	@RequestMapping(value="/signUpPage")
	public String signUp() {
		return "signUp";
	}
	
	@PostMapping(value="/register",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseDTO> register(MultipartHttpServletRequest request) {
		
		
		//Users customer=new Users();
		String threadPid = request.getParameterValues("threadPid")[0];
		//MultipartFile file = request.getFile("file");
		Gson gson = new Gson();
		
		Users customer = gson.fromJson(threadPid,Users.class);
		
		
		customer.setEmail(customer.getEmail().toLowerCase());
		customer.setAddress("");
		customer.setCity("");
		customer.setGender(customer.getGender());
		customer.setFirstname(customer.getFirstname());
		customer.setLastname(customer.getLastname());
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		customer.setPhone("");
		customer.setRegion("");
		
		customer.setIsVerified(0);
		customer.setToken(UUID.randomUUID().toString());
		customer.setTokenDateTime(new Date());
		
		
		customer.setRole("customer");
		userService.signUp(customer);
		
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setMessage("success");
		
		
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
		
		
	}
	
	@RequestMapping(value="/success")
	public String success() {
		
		return "success";
	}
	
	
	@RequestMapping(value="/accessDenied")
	public String accessDenied() {
		
		
		return "accessDenied";
	}
	
	@RequestMapping(value="/makeList")
	public String makeList() {
		String message="success";
		studentService.makeList();
		
		return message;
	}
	
	
	@RequestMapping(value="/confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView confirmUserAccount(ModelAndView modelAndView, @RequestParam("token")String confirmationToken)
	{
	//check token
	/*
	 * if(token != null) { User user =
	 * userRepository.findByEmailIdIgnoreCase(token.getUser().getEmailId());
	 * user.setEnabled(true); userRepository.save(user);
	 * modelAndView.setViewName("accountVerified"); } else {
	 * modelAndView.addObject("message","The link is invalid or broken!");
	 * modelAndView.setViewName("error"); }
	 */
		
		return modelAndView;
	}
}
