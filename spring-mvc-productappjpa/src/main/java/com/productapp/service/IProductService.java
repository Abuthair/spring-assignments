package com.productapp.service;

import java.util.List;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService {
	void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    List<Product> gellAll();
    List<Product> getByChoice(String choice) throws ProductNotFoundException;
    List<Product> getByCategory(String category)throws ProductNotFoundException;
//    List<Product> getByLesserPrice(double price)throws ProductNotFoundException;
//    List<Product> getByBrandStarting(String brand)throws ProductNotFoundException;
    Product getById(int productId)throws ProductNotFoundException;
}
