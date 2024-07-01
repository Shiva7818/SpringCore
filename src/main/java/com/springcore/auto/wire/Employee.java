package com.springcore.auto.wire;

public class Employee {
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
