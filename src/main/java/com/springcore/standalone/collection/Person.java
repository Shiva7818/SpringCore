package com.springcore.standalone.collection;
import java.util.*;
public class Person {
	

private List<String> friends;
private Map<String,String> feeStructure;
private Properties properties;

public Person(List<String> friends, Map<String, String> feeStructure, Properties properties) {
	super();
	this.friends = friends;
	this.feeStructure = feeStructure;
	this.properties = properties;
}

public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}


public Map<String, String> getFeeStructure() {
	return feeStructure;
}

public void setFeeStructure(Map<String, String> feeStructure) {
	this.feeStructure = feeStructure;
}

public Person() {
	super();
	
}
@Override
public String toString() {
	return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
}

}
