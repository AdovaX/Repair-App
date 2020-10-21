package com.indocosmo.mmp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.indocosmo.mmp.model.Repairs;

@Repository
public interface RepairRepository extends CrudRepository<Repairs, Integer>{
	
	

}
