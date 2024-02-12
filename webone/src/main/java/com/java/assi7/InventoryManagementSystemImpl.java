package com.java.assi7;

import java.util.*;

import org.apache.log4j.Logger;

public class InventoryManagementSystemImpl implements InventoryManagementSystem {
	private Map<Integer, Product> products;
	public static final Logger Log = Logger.getLogger("com.java.assi7.InventoryManagementSystemImpl");
	
	 public InventoryManagementSystemImpl() {
	        this.products = new HashMap<>();
	    }


	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		 products.put(product.getId(), product);
	     Log.info("Product added: " + product);
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> allProducts = new ArrayList<>(products.values());
        Log.info("Retrieved all products: " + allProducts);
        return allProducts;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		Product product = products.get(id);
        if (product != null) {
        	Log.info("Retrieved product by ID " + id + ": " + product);
        } else {
        	Log.warn("Product with ID " + id + " not found");
        }
        return product;
	}

}
