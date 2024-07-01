package com.springcore.ci;

public class Certi {
private String name;
public Certi(String name)
{   
	System.out.println("In Certi constructor");
	this.name=name;
}
@Override
public String toString() {
	return "Certi [name=" + name + "]";
}

}
