package com.springcore.auto.wire;

public class Address {
String city;
String street;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [city=" + city + ", street=" + street + "]";
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public Address(String city, String street) {
	super();
	this.city = city;
	this.street = street;
}

}
