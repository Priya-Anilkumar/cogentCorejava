package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;

public class EmployeeService {

	private static EmployeeService employeeservice;
	private EmployeeService() {
		
	}
	public static EmployeeService getInstance() {
		if(EmployeeService==null) {
			EmployeeService= new  EmployeeService();
			return EmployeeService;		}
		return EmployeeService;
	}
	
	
//	EmployeeRepository  employeerepository =new EmployeeRepository();
	EmployeeRepository  employeerepository =EmployeeRepository.getInstance();
	public String addEmployee(Employee employee) {
		return employeerepository.addEmployee(employee);
	}
	
	public Employee getEmployee(String Id) {
		return employeerepository.getEmployeebyId(Id);
	}
	
}
