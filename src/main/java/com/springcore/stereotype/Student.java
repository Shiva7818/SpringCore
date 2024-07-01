package com.springcore.stereotype;
import org.springframework.beans.factory.annotation.Value;
import java.util.*;
import org.springframework.stereotype.Component;
@Component("st")
public class Student {
	@Value("Shiva Sharma")
private String studentName;
	@Value("City")
	
private String city;
	@Value("#{friends}")
	private List<String> friends;
	public String getStudentName() {
		System.out.println("Inside getStudentName");
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Inside setStudentName");
		this.studentName = studentName;
	}
	public String getCity() {
		System.out.println("Inside getCity");
		return city;
	}
	public void setCity(String city) {
		System.out.println("Inside setCity");
		this.city = city;
	}
	public List<String> getFriends() {
		System.out.println("Inside setSFriends");
		return friends;
	}
	public void setFriends(List<String> friends) {
		System.out.println("Inside setSFriends");
		this.friends = friends;
	}
	public Student(String studentName, String city, List<String> friends) {
		super();
		System.out.println("Inside Student constructor");
		this.studentName = studentName;
		this.city = city;
		this.friends = friends;
	}
	@Override
	public String toString() {
		System.out.println("Inside toString");
		return "Student [studentName=" + studentName + ", city=" + city + ", friends=" + friends + "]";
	}
	public Student() {
		super();
		
	}


}
