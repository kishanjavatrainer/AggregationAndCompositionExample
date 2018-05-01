package com.infotech.model;

public class Employee {
	
	private String empId;
	private String firstName;
	private String lastName;
	private int age;
	
	//Aggregation Java example
	private Address address;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", address="
				+ address + "]";
	}
}