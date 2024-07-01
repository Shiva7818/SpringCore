package com.springcore.springBean.scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springBean/scope/scopeConfig.xml");
	Student st1 = context.getBean("student1",Student.class);
	Student st2 = context.getBean("student1",Student.class);
	System.out.println(st1);
	System.out.println(st1.hashCode());
	System.out.println(st2);
	System.out.println(st2.hashCode());
	
	

	}

}
