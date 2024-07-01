package com.springcore.standalone.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
        Person pers = context.getBean("person1",Person.class);
        System.out.println(pers);
        System.out.println(pers.getFriends().getClass());
	}

}
