package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		EmployeeService employeeservice=new EmployeeService();
//		Employee emp1;
		Employee employee2=new Employee("p001","priya","Anil",100.0f,"NY");
		
		String result = employeeservice.addEmployee(employee2);
		System.out.println(result);
		
		Employee emp = employeeservice.getEmployee("p001");
		System.out.print(emp.getFirstName());
		
/*		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getFirstName());
		System.out.println(employee2.getLastName());
		System.out.println(employee2.getEmpSalary());
		System.out.println(employee2.getAddress());*/
//		emp1.getAddress();
		
/*		Employee[] employees  =new Employee[10];
		 for(int i=0;i<employees.length;i++) {
			employees[i]=new Employee();
		 }
		 
		for(Employee employee4: employees) {
			System.out.println(employee4);
		}*/
		
	}
	
}
