package com.indocosmo.mmp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.indocosmo.mmp.model.Productmodel;

@Repository
public interface ProductModelRepository extends CrudRepository<Productmodel, Integer>{
	
	@Query(value="select * from productmodel where product_id=?1",nativeQuery = true)
	List<Productmodel> findAllProductModelsById(int id);
	

}
