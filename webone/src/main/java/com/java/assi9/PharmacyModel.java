package com.java.assi9;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PharmacyModel {
	

	    private List<Medicine> medicines;

	    public PharmacyModel() {
	        this.medicines = new ArrayList<>();
	    }

	    public void addMedicine(String name, int quantity, LocalDate expiryDate) {
	        int id = medicines.size() + 1;
	        Medicine medicine = new Medicine(id, name, quantity, expiryDate);
	        medicines.add(medicine);
	    }

	    public void updateStock(int id, int quantity) {
	        Medicine medicine = getMedicineById(id);
	        if (medicine != null) {
	            medicine.setQuantity(quantity);
	        }
	    }
	    public Medicine getMedicineById(int id) {
	        for (Medicine medicine : medicines) {
	            if (medicine.getId() == id) {
	                return medicine;
	            }
	        }
	        return null; 
	    }

	    public List<Medicine> getExpiringMedicines() {
	        List<Medicine> expiringMedicines = new ArrayList<>();
	        LocalDate today = LocalDate.now();
	        for (Medicine medicine : medicines) {
	            if (medicine.getExpiryDate().isBefore(today.plusMonths(1))) {
	                expiringMedicines.add(medicine);
	            }
	        }
	        return expiringMedicines;
	    }

	    public List<Medicine> getAllMedicines() {
	        return new ArrayList<>(medicines);
	    }
	}



