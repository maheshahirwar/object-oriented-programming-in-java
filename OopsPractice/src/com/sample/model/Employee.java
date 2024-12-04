package com.sample.model;

// class 
class Company{
	String companyName;
	String companyAddress;
	String companyType;
	
	public Company() {}
	
	public Company(String companyName, String companyAddress, String companyType) {
		System.out.println(" In Company Constructor...");
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyType = companyType;
	}

	public void buildSoftware() {
		System.out.println(companyName+" is building software!!");
	}
}

// Inheritance 
class Department extends Company{
	String depName;
	
	public Department() {}
	
	public Department(String companyName, String companyAddress, String companyType, String depName) {
		super(companyName, companyAddress, companyType);
		System.out.println(" In Department constructor... ");
		this.depName = depName;
	}

	public void departmentWork() {
		System.out.println(depName+ " is doing work!!");
	}
	
	// method overriding --> run time polymorphism
	@Override
	public void buildSoftware() {
		System.out.println(companyName+" is building software!! in "+depName);
	}
}



// Encapsulated class 
public class Employee extends Department{
	
	// state/properties/attributes
	 private String empName; // access modifier --> private
	 private String empId;
	 private String emailId;
	 private long contactNo;
	 private int salary;
	 
	 // aggregation --> HAS_A 
	 private Address address;
	 
	 
	 // constructor without parameter --> default constructor
	 public Employee() {}
	
	 // constructor with parameter
	public Employee(String companyName, String companyAddress, String companyType, String depName, String empName, String empId, String emailId, long contactNo, int salary, Address address) {
		super(companyName, companyAddress, companyType, depName);
		System.out.println(" In employee constructor... ");
		this.empName = empName;
		this.empId = empId;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.salary = salary;
		this.address = address;
	}

	
	// getter and setter for encapsulation 
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	// behavior/functionalities --> method
	public void work() {
		System.out.println(empName+" is doing work!!");
	}
	/*
	 * Rule : first four chars of employee's name and last four digit of employee's contact no
	 */
	public String generatePassword() {
		String first = empName.substring(0,4);
		String last = String.valueOf(contactNo).substring(6);
		return first+last;
	}
	
	// method overloading --> compile time polymorphism
	public String generatePassword(String name, long contactNo) {
		String first = name.substring(0,4);
		String last = String.valueOf(contactNo).substring(6);
		return first+last;
	}
	
// method overriding --> run time polymorphism
	@Override
	public void buildSoftware() {
		System.out.println(companyName+" is building software!! in "+depName+" department with "+empName);
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", emailId=" + emailId + ", contactNo=" + contactNo
				+ ", salary=" + salary + ", address=" + address + "]";
	}
}