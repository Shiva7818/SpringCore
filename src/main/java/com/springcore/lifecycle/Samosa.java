package com.springcore.lifecycle;

public class Samosa {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Samosa(int price) {
	super();
	System.out.println("Under Samosa Constructor");
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void registerShutdownHook() {
	// TODO Auto-generated method stub
	System.out.println("Under Samosa destroy method");
}
public void init()
{
	System.out.println("Under Samosa init method");
}
public void destroy()
{
	System.out.println("Under Samosa destroy method");
}


}
