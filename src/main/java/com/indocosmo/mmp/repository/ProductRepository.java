package com.indocosmo.mmp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.indocosmo.mmp.model.Products;

public interface ProductRepository extends CrudRepository<Products, Integer>{
	
	@Query(value="select * from Products where categoryId=?1",nativeQuery = true)
	List<Products> getProductByCategoryId(int id);
	
	

}
