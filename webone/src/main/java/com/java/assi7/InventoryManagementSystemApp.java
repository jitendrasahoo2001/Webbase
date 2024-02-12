package com.java.assi7;

import java.util.List;

import org.apache.log4j.Logger;

public class InventoryManagementSystemApp {
	public static final Logger Log = Logger.getLogger("com.java.assi7.InventoryManagementSystemApp");


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystemImpl();

	        inventoryManagementSystem.addProduct(new Product(1, "Laptop", 999999, 10));
	        inventoryManagementSystem.addProduct(new Product(2, "Smartphone", 5999999, 20));
	        inventoryManagementSystem.addProduct(new Product(3, "Tablet", 29999, 15));

	        List<Product> allProducts = inventoryManagementSystem.getAllProducts();
	        Log.info("All Products:");
	        for (Product product : allProducts) {
	        	Log.info(product);
	        }

	        int productIdToFind = 3;
	        Product productById = inventoryManagementSystem.getProductById(productIdToFind);
	        if (productById != null) {
	        	Log.info("Product with ID " + productIdToFind + ": " + productById);
	        } else {
	        	Log.warn("Product with ID " + productIdToFind + " not found.");
	        }

	}

}
