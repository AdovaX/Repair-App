package com.indocosmo.mmp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Repairs {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer RepairId;

	  private String accesories;
	  private Integer customerid;
	  private Integer productid;
	  private String status;
	  private String repairdesc;
	  private Date createddate;
	  private Integer modelid;
	  
	
	public Integer getRepairId() {
		return RepairId;
	}
	public void setRepairId(Integer repairId) {
		RepairId = repairId;
	}
	public String getAccesories() {
		return accesories;
	}
	public void setAccesories(String accesories) {
		this.accesories = accesories;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRepairdesc() {
		return repairdesc;
	}
	public void setRepairdesc(String repairdesc) {
		this.repairdesc = repairdesc;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	
	
	public Integer getModelid() {
		return modelid;
	}
	public void setModelid(Integer modelid) {
		this.modelid = modelid;
	}
	public Repairs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Repairs(Integer repairId, String accesories, Integer customerid, Integer productid, String status,
			String repairdesc, Date createddate, Integer modelid) {
		super();
		RepairId = repairId;
		this.accesories = accesories;
		this.customerid = customerid;
		this.productid = productid;
		this.status = status;
		this.repairdesc = repairdesc;
		this.createddate = createddate;
		this.modelid = modelid;
	}


	  
	  
	  
	  
	  
	  
	  

}
