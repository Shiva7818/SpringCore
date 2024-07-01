package com.springcore.auto.wire;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {
public static void  main(String args[])
{
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
	Employee emp = context.getBean("emp1",Employee.class);
	System.out.println(emp);
}
}
