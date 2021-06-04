package lab5.program.third;

import java.util.Scanner;

public class ValidateSalary {
	
		
		static void validate(int salary) throws EmployeeException {
	        if (salary < 3000)
	            throw new EmployeeException("Invalid Salary! Salary can not be less than 3000.");
	        else
	            System.out.println("Valid salary!");
	    }

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the Employee's salary: ");
		    int sal = sc.nextInt();
		    try { 
		    	validate(sal);
		    }
		    catch (Exception e) { 
		    	System.out.println("Exception occurred! " + e);
		    }
		    sc.close();

		}

}
