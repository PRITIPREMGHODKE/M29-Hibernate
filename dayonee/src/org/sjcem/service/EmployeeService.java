package org.sjcem.service;

import org.sjcem.entities.Employee;

public interface EmployeeService {

	//user-defined method for CURD operation
	void createEmployee(Employee emp);//create
	Employee retrieveEmployee(int id);//retrieve
	void updateEmployee(Employee emp);//update
	void removeEmployee(Employee emp);//delete
}
