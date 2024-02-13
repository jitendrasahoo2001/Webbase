package com.java.assi9;

import java.time.LocalDate;

public class PharmacyManagementApp {
	    public static void main(String[] args) {
	        PharmacyModel model = new PharmacyModel();
	        PharmacyView view = new PharmacyView();
	        PharmacyController controller = new PharmacyController(model, view);

	        controller.addMedicine("Paracetamol", 100, LocalDate.of(2024, 12, 31));
	        controller.addMedicine("Biotin 10mg", 50, LocalDate.of(2024, 10, 15));
	        controller.addMedicine("Multivitamin", 80, LocalDate.of(2024, 8, 20));

	        controller.viewMedicineDetails();

	        controller.updateStock(1, 120);

	        controller.viewMedicineDetails();

	        controller.checkExpiryStatus();
	    }
	}


