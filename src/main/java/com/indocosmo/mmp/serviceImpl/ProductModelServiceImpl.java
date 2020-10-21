package com.indocosmo.mmp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indocosmo.mmp.model.Productmodel;
import com.indocosmo.mmp.repository.ProductModelRepository;
import com.indocosmo.mmp.service.ProductModelService;

@Service
@Transactional
public class ProductModelServiceImpl implements ProductModelService {
	
	@Autowired
	private ProductModelRepository productModelRepository;
	
	

	@Override
	public List<Productmodel> getProductModelById(int id) {
		// TODO Auto-generated method stub
		return productModelRepository.findAllProductModelsById(id);
	}

}
 