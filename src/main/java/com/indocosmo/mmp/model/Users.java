package com.indocosmo.mmp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Users {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String firstname;
  private String lastname;
  private String phone;
  private String city;
  private String address;
  private String region;
  private String country;
  private String image;
  private String email;
  private String username;
  private String password;
  private String role;
  private String gender;
  
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  
  



  public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Users( String firstname, String lastname, String phone, String city, String address, String region,
		String country, String image, String email, String username, String password, String role,String gender) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.phone = phone;
	this.city = city;
	this.address = address;
	this.region = region;
	this.country = country;
	this.image = image;
	this.email = email;
	this.username = username;
	this.password = password;
	this.role = role;
	this.gender = gender;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}



public Users() {
	// TODO Auto-generated constructor stub
}
  
  
}