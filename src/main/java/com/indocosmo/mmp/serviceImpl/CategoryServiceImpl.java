package com.indocosmo.mmp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indocosmo.mmp.model.Category;
import com.indocosmo.mmp.repository.CategoryRepository;
import com.indocosmo.mmp.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Iterable<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
