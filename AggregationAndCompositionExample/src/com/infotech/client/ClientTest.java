package com.infotech.client;

import java.time.Period;

import com.infotech.model.Address;
import com.infotech.model.Employee;
import com.infotech.model.Person;



public class ClientTest {

	public static void main(String[] args) {
		aggregationDemo();
		//compositionDemo();
	}

	@SuppressWarnings("unused")
	private static void compositionDemo() {
		Person person = new Person();
		
		person.setEmpId("EMP0001");
		person.setFirstName("Sean");
		person.setLastName("Murphy");
		person.getAddress().setCity("Delhi");
		person.getAddress().setAddressLine1("address Line1");
		person.getAddress().setAddressLine2("address Line2");
		person.getAddress().setStreet("MG Park");
		
		System.out.println(person);
		person = null;
		System.out.println("------------------------------------------");
		System.out.println(person);
		if(person !=null)
		System.out.println(person.getAddress());
		else
			System.out.println("Address does not exist..");
		
		
		
	}

	private static void aggregationDemo() {
		Address address = new Address();
		address.setAddressLine1("address Line1");
		address.setAddressLine2("address Line2");
		address.setCity("Mumbai");
		address.setStreet("Park Street");
		
		Employee employee = new Employee();
		employee.setAddress(address);
		employee.setAge(30);
		employee.setFirstName("Sean");
		employee.setLastName("Murphy");
		
		System.out.println(employee);
		employee = null;
		System.out.println("-------------------------------------------");
		System.out.println(employee);
		System.out.println(address);
	}
}
