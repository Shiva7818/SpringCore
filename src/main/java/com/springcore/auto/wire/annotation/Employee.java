package com.springcore.auto.wire.annotation;
//Autowired annotation can be used on property , setter and constructor
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
@Autowired
@Qualifier("address1")
private Address address;
	
public Employee(Address address) {
	super();
	System.out.println("Inside Employee constrructor");
	this.address = address;
}

public Employee() {
	super();

}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
}
