//program to demonstrate on CRUD using JPA with hibernate
//driver class
package org.sjcem.client;
import org.sjcem.entities.Employee;
import org.sjcem.service.EmployeeService;
import org.sjcem.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp=new Employee();
		
		//create 
		emp.setId(101);
		emp.setName("priti ghodke");
		service.createEmployee(emp);
		
	  System.out.println("The data added sucessfully is the database");

	}

}
