package com.springcore.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//		Samosa obj = (Samosa)context.getBean("s1");
//		System.out.println(obj);
//		Registering shutdown hook
//		obj.registerShutdownHook();
		System.out.println("----------------------------------------");
//		Pepsi p = (Pepsi)context.getBean("p1");
//		System.out.println(p);
		
		Example ob = (Example)context.getBean("e1");
		System.out.println(ob);

	}

}
