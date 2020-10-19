package com.indocosmo.mmp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.indocosmo.mmp.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

	

}
