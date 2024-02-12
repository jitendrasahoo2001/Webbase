package com.java.assi7;

import java.util.*;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.log4j.Logger;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
	
//	 public static final Logger Log = LogManager.getLogger("com.java.assi7.EmployeeManagementSystemImpl");
	 public static final Logger Log = Logger.getLogger("com.java.assi7.EmployeeManagementSystemImpl");
	 private Map<Integer, Employee> employees;
	 
	 
	 public EmployeeManagementSystemImpl() {
	        this.employees = new HashMap<>();
	    }



	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employees.put(employee.getId(), employee);
		Log.info("Employee added: " + employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> allEmployees = new ArrayList<>(employees.values());
		Log.info("Retrieved all employees: " + allEmployees);
        return allEmployees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee employee = employees.get(id);
        if (employee != null) {
        	Log.info("Retrieved employee by ID " + id + ":" + employee);
        } else {
        	Log.warn("Employee with id " + id + " not found");
        }
        return employee;
	}

}
