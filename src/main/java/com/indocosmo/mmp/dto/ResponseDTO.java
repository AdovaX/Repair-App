package com.indocosmo.mmp.dto;

import java.util.List;

import com.indocosmo.mmp.model.Category;
import com.indocosmo.mmp.model.Productmodel;
import com.indocosmo.mmp.model.Products;

public class ResponseDTO {
	private String message;
	private Iterable<Category>  categoryNames;
	private List<Products> productList;
	private List<Productmodel> productModelList;
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Iterable<Category> getCategoryNames() {
		return categoryNames;
	}

	public void setCategoryNames(Iterable<Category> category) {
		this.categoryNames = category;
	}

	public List<Products> getProductList() {
		return productList;
	}

	public void setProductList(List<Products> productList) {
		this.productList = productList;
	}

	public List<Productmodel> getProductModelList() {
		return productModelList;
	}

	public void setProductModelList(List<Productmodel> productModelList) {
		this.productModelList = productModelList;
	}
	
	
	
	
	
	

}
