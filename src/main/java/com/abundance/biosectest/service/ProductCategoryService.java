package com.abundance.biosectest.service;

import java.util.Collection;

import com.abundance.biosectest.dto.ProductCategoryDto;
import com.abundance.biosectest.dto.ServerResponse;
import com.abundance.biosectest.model.ProductCategory;
import org.springframework.stereotype.Service;


@Service
public interface ProductCategoryService {

	public Collection<ProductCategory> findAll();
	
	public  ProductCategory findByCategoryId(String categoryId);
	
	public ProductCategory findByCategoryName(String categoryName);
	
	ServerResponse create(ProductCategoryDto category);
	
	ServerResponse viewAll();
	
	ServerResponse delete(String categoryId);

	
}
