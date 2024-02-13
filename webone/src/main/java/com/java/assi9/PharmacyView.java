package com.java.assi9;

import java.util.List;

public class PharmacyView {
	 public void displayMedicineList(List<Medicine> medicines) {
	        System.out.println("Medicine List:");
	        for (Medicine medicine : medicines) {
	            System.out.println(medicine.getId() + ": " + medicine.getName() + " - Quantity: " + medicine.getQuantity() + " - Expiry Date: " + medicine.getExpiryDate());
	        }
	        System.out.println();
	    }

	    public void displayExpiringMedicines(List<Medicine> expiringMedicines) {
	        System.out.println("Expiring Medicines:");
	        for (Medicine medicine : expiringMedicines) {
	            System.out.println(medicine.getName() + " - Quantity: " + medicine.getQuantity() + " - Expiry Date: " + medicine.getExpiryDate());
	        }
	        System.out.println();
	    }

	    public void displayMessage(String message) {
	        System.out.println(message);
	    }
	

}
