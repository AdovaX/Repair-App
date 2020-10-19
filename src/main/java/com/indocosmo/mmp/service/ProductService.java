package com.indocosmo.mmp.service;

import java.util.List;

import com.indocosmo.mmp.model.Products;

public interface ProductService {

	List<Products> getproductByCategoryId(int id);

}
