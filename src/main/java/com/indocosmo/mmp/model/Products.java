package com.indocosmo.mmp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	 @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer id;
	 private Integer categoryId;
	 private String productname;
	 private Double pricebuy;
	 private Double priceSell;
	 private String category;
	 private Double stockcost;
	 private Double stockvolume;
	 private String imageurl;
	 private Integer warranty;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Double getPricebuy() {
		return pricebuy;
	}
	public void setPricebuy(Double pricebuy) {
		this.pricebuy = pricebuy;
	}
	public Double getPriceSell() {
		return priceSell;
	}
	public void setPriceSell(Double priceSell) {
		this.priceSell = priceSell;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getStockcost() {
		return stockcost;
	}
	public void setStockcost(Double stockcost) {
		this.stockcost = stockcost;
	}
	public Double getStockvolume() {
		return stockvolume;
	}
	public void setStockvolume(Double stockvolume) {
		this.stockvolume = stockvolume;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public Integer getWarranty() {
		return warranty;
	}
	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}
	public Products(Integer id, Integer categoryId, String productname, Double pricebuy, Double priceSell,
			String category, Double stockcost, Double stockvolume, String imageurl, Integer warranty) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productname = productname;
		this.pricebuy = pricebuy;
		this.priceSell = priceSell;
		this.category = category;
		this.stockcost = stockcost;
		this.stockvolume = stockvolume;
		this.imageurl = imageurl;
		this.warranty = warranty;
	}
	public Products() {
		super();
	}
	 
	
	 
	 
	 
	 
	  

}
