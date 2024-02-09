package com.java.assi7;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
	
	 public static final Logger logger = LogManager.getLogger("com.java.assi7.EmployeeManagementSystemImpl");
	 private Map<Integer, Employee> employees;
	 
	 
	 public EmployeeManagementSystemImpl() {
	        this.employees = new HashMap<>();
	    }



	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employees.put(employee.getId(), employee);
        logger.info("Employee added: " + employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> allEmployees = new ArrayList<>(employees.values());
        logger.info("Retrieved all employees: " + allEmployees);
        return allEmployees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee employee = employees.get(id);
        if (employee != null) {
            logger.info("Retrieved employee by ID " + id + ":" + employee);
        } else {
            logger.warn("Employee with id " + id + " not found");
        }
        return employee;
	}

}
