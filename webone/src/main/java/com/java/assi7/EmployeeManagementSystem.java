package com.java.assi7;

import java.util.List;

public interface EmployeeManagementSystem {
	 void addEmployee(Employee employee);
	 
	    List<Employee> getAllEmployees();
	    
	    Employee getEmployeeById(int id);

}
