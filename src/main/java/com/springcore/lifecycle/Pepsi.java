package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean {
public Pepsi() {
		
		
	}

private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("Setting pepsi price");
	this.price = price;
}

public Pepsi(double price) {
	super();
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("In pepsi init method");
	
}

public void destroy()throws Exception
{
	System.out.println("In pepsi destroy ");
}

}
