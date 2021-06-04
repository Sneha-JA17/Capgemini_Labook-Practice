package com.capgemini.eis.bean;


public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public String empDesignation;
	public String insuranceScheme;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, double empSalary, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
	
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDesignation == null) ? 0 : empDesignation.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(empSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((insuranceScheme == null) ? 0 : insuranceScheme.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empDesignation == null) {
			if (other.empDesignation != null)
				return false;
		} else if (!empDesignation.equals(other.empDesignation))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.doubleToLongBits(empSalary) != Double.doubleToLongBits(other.empSalary))
			return false;
		if (insuranceScheme == null) {
			if (other.insuranceScheme != null)
				return false;
		} else if (!insuranceScheme.equals(other.insuranceScheme))
			return false;
		return true;
	}
	public String insuranceScheme() {
		insuranceScheme="no scheme";
		if(this.empSalary<5000  && this.empDesignation.equalsIgnoreCase("clerk"))
			insuranceScheme= "no scheme";
		else if((this.empSalary>5000 && this.empSalary<=20000)&& this.empDesignation.equalsIgnoreCase("system associate") )
			insuranceScheme= "scheme -> C";
		else if((this.empSalary>=20000 && this.empSalary<40000)&& this.empDesignation.equalsIgnoreCase("Programmer") )
			insuranceScheme= "scheme -> B";
		else if(this.empSalary>=40000 && this.empDesignation.equalsIgnoreCase("manager") )
			insuranceScheme= "scheme -> A";
		
		return insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesignation="
				+ empDesignation + ", insuranceScheme=" + insuranceScheme + "]";
	}

}
