package com.springcore.ci;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        Person obj = (Person)context.getBean("person");
//        System.out.println(obj);
        Addition obj1 = (Addition)context.getBean("add");
        obj1.sum();
	}
}
	