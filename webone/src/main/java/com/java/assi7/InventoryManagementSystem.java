package com.java.assi7;

import java.util.List;

public interface InventoryManagementSystem {
	void addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(int id);

}
