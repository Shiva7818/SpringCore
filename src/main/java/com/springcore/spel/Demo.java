package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo1")
public class Demo {
	@Value("#{24+25}")
private int x;
	@Value("#{33+55}")
private int y;

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public Demo(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + "]";
}

public Demo() {
	super();
	
}

}
