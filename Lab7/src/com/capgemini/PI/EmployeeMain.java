package com.capgemini.PI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.eis.bean.Employee;
import com.capgemini.eis.service.EmployeeServiceClass;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int ch='y';
  int choice;
  Scanner sc= new Scanner(System.in);
  EmployeeServiceClass es=new EmployeeServiceClass();
  while(ch=='y') {
	  System.out.println("1.Create Employee Details\n"+" 2.Display Employee Details with medical scheme \n" +"3.Delete employee");
	  System.out.println("Enter your choice");
	  choice=sc.nextInt();
	  switch(choice) {
		case 1 : System.out.print("Enter the number of employees : ");
		es.getEmployeeDetails();
		es.addEmployee();
		System.out.println("Employee added Successfully");
		break;
	case 2:
		es.showEmployeedetails();
		break;
		default : System.out.println("Enter correct choice....");
		}
		System.out.println();
		System.out.print("Do you want to continue?(y/n) ");
		ch=sc.next().charAt(0);
	}
	sc.close();
	}


}
