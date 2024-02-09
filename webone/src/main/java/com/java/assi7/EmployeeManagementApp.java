package com.java.assi7;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeManagementApp {
	public static final Logger logger = LogManager.getLogger("com.java.assi7.EmployeeManagementApp");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystemImpl();

        employeeManagementSystem.addEmployee(new Employee(1, "Jite Sahoo", "Engineering"));
        employeeManagementSystem.addEmployee(new Employee(2, "Srini Mohan", "HR"));
        employeeManagementSystem.addEmployee(new Employee(3, "Amit Mishra", "Finance"));

        List<Employee> allEmployees = employeeManagementSystem.getAllEmployees();
        logger.info("All Employees:");
        for (Employee employee : allEmployees) {
            logger.info(employee);
        }

        int employeeIdToFind = 2;
        Employee employeeById = employeeManagementSystem.getEmployeeById(employeeIdToFind);
        if (employeeById != null) {
            logger.info("Employee with ID " + employeeIdToFind + ": " + employeeById);
        } else {
            logger.warn("Employee with ID " + employeeIdToFind + " not found.");
        }

	}

}
