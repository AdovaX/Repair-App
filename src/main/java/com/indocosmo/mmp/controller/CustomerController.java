package com.indocosmo.mmp.controller;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.gson.Gson;
import com.indocosmo.mmp.dto.ResponseDTO;
import com.indocosmo.mmp.model.Users;
import com.indocosmo.mmp.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService studentService;
	
	@Autowired
	private CustomerService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@RequestMapping(value="/")
	public String indexPage() {
		
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value="/adminHome")
	public String getAdminHome() {
		
		return "adminHome";
	}
	
	@RequestMapping(value="/userHome")
	public String getUserHome() {
		
		return "userHome";
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
		
		
		System.out.println(customer.getUsername());
		
		
		customer.setEmail(customer.getEmail().toLowerCase());
		customer.setAddress("");
		customer.setCity("");
		customer.setFirstname(customer.getFirstname());
		customer.setLastname(customer.getLastname());
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		customer.setUsername(customer.getUsername());
		customer.setCountry("");
		customer.setImage("");
		customer.setPhone("");
		customer.setRegion("");
		
		
		customer.setRole("user");
		
		
		//customer.setUsername(username);
		//customer.setPassword(passwordEncoder.encode(password));
		//customer.setRole(role);
		userService.signUp(customer);
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setMessage("success");
		
		
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@RequestMapping(value="/success")
	public String success() {
		
		return "success";
	}
	
/*	@RequestMapping(value="/getStudents")
	public String getStudents(Model model) {
		
		model.addAttribute("studentList", studentService.findAll());
		return "studentList";
	}*/
	
	/*@RequestMapping(value="/getUsers")
	public String getUsers(Model model) {
		
		model.addAttribute("userList", userService.findAll());
		return "usersList";
	}*/
	
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
}
