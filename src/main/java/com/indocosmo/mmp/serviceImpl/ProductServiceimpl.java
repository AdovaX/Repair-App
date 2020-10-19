package com.indocosmo.mmp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indocosmo.mmp.model.Products;
import com.indocosmo.mmp.repository.ProductRepository;
import com.indocosmo.mmp.service.ProductService;

@Service
@Transactional
public class ProductServiceimpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Products> getproductByCategoryId(int id) {
		// TODO Auto-generated method stub
		return productRepository.getProductByCategoryId(id);
	}

}
