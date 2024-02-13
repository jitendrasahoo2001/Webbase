package com.java.assi9;
import java.time.LocalDate;
import java.util.List;

public class PharmacyController {
	

	    private PharmacyModel model;
	    private PharmacyView view;

	    public PharmacyController(PharmacyModel model, PharmacyView view) {
	        this.model = model;
	        this.view = view;
	    }

	    public void addMedicine(String name, int quantity, LocalDate expiryDate) {
	        model.addMedicine(name, quantity, expiryDate);
	    }

	    public void updateStock(int id, int quantity) {
	        model.updateStock(id, quantity);
	    }

	    public void checkExpiryStatus() {
	        List<Medicine> expiringMedicines = model.getExpiringMedicines();
	        view.displayExpiringMedicines(expiringMedicines);
	    }

	    public void viewMedicineDetails() {
	        List<Medicine> medicines = model.getAllMedicines();
	        view.displayMedicineList(medicines);
	    }
	}



