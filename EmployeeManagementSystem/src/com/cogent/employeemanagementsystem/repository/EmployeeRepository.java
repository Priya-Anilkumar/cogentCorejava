package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepository {
	private static final String EmployeeRepository = null;
	private static EmployeeRepository employeerepository; 
	
	
	private EmployeeRepository() {
		
	}
	public static EmployeeRepository getInstance() {
		if(EmployeeRepository==null) {
			employeerepository= new  EmployeeRepository();
			return employeerepository;
		}
		return employeerepository;
	}

	private Employee employees[]= new Employee[10];
	static int counter=-1;
	public String addEmployee(Employee employee) {
		if(counter>=employees.length) {
			System.out.println("full");
		}
		employees[++counter]=employee;
		return "Success";
	}
	
    public Employee getEmployeebyId(String Id) {
	
    	for(Employee employee:employees) {
    		if(employee!=null && Id.equals(employee.getEmployeeId())) {
    			return employee;
    		}
    	}
		return null;
	}
}
