package com.abundance.biosectest.service;

import java.util.Collection;

import com.abundance.biosectest.dto.ProductAdditionDto;
import com.abundance.biosectest.dto.ProductRemovalDto;
import com.abundance.biosectest.dto.ServerResponse;
import com.abundance.biosectest.dto.UpdateProductDto;
import com.abundance.biosectest.model.Product;
import org.springframework.stereotype.Service;

import com.abundance.biosectest.dto.ProductDto;


@Service
public interface ProductService {
	
	public Collection<Product> findAll();
	
	public Product findByProductId(String productId);
	
	public Product findByProductName(String productName);
	
	public Product findByPrice(double price);
	
	public Collection<Product> findByProductCategory(String categoryId);
	
	ServerResponse create(ProductDto request);
	
	ServerResponse update(String productId, UpdateProductDto request);
	
	ServerResponse addProductToUserCart(String productId, long usersId, ProductAdditionDto request);
	
	ServerResponse removeProductFromUserCart(String productId, long usersId, ProductRemovalDto request);
	
	ServerResponse getProduct(String productId);
	
	ServerResponse viewAll();
	
	ServerResponse getProductByCategory(String categoryId);

}
