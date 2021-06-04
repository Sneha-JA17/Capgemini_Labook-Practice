package com.capgemini.eis.service;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.eis.bean.Employee;


/**
 * 
 * @author sneha
 *
 */
interface EmployeeServiceInterface{
	void getEmployeeDetails();
	void showEmployeeDetails();
}
public class EmployeeServiceClass extends Employee {
	
	Map<String, Employee> employeeList=new ConcurrentHashMap<String,Employee>();
	Employee employee=new Employee();
	Scanner sc=new Scanner(System.in);
	
	/**
	 * Declaring the class variables
	 */
	int eId;
	String name;
	double salary;
	String designation;
	String insuranceScheme;
	
	public EmployeeServiceClass(){
		
	}
	/**
	 * method to create an employee by genesis
	 */
	public void getEmployeeDetails() {
		System.out.println("-------------------------------------------");
		System.out.println("Enter Employee Id:");
		eId=sc.nextInt();
		
		System.out.println("Enter Employee name:");
		name=sc.next();
		
		System.out.println("Enter Employee salary:");
		salary=sc.nextDouble();
		
		System.out.println("Enter Employee Designation:");
		sc.nextLine();
		designation=sc.nextLine();
		
		
	}
	
	/**
	 * adding an employee method 
	 */
	public void addEmployee() {
		employee=new Employee(eId,name,salary,designation);
		
		employeeList.put(generateKey(employee), employee);
	}

	private String generateKey(Employee employee) {
		return String.format("%s-%s", employee.getEmpId(),employee.getEmpName());
	}
	/**
	 * displaying the details method 
	 */
	public void showEmployeedetails() {
		insuranceScheme=employee.insuranceScheme();
		System.out.println(employee.toString());
		System.out.println("Insurance Scheme : "+insuranceScheme);
	}
}