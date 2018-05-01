package com.infotech.model;

public class Person {

	private String empId;
	private String firstName;
	private String lastName;
	private Address address;
	
	//Composition example
	public Person() {
		address = new Address();
	}

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
	
	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [empId=" + empId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address + "]";
	}
}
