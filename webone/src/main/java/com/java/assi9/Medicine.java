package com.java.assi9;

import java.time.LocalDate;

public class Medicine {
	private int id;
    private String name;
    private int quantity;
    private LocalDate expiryDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Medicine(int id, String name, int quantity, LocalDate expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.expiryDate = expiryDate;
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", quantity=" + quantity + ", expiryDate=" + expiryDate + "]";
	}
    
    

}
