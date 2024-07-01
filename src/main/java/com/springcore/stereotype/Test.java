package com.springcore.stereotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student st = context.getBean("st",Student.class);
//		System.out.println(st);
//		System.out.println("Friends "+st.getFriends());
		
		System.out.println(st.hashCode());
		Student st1 = context.getBean("st",Student.class);
		System.out.println(st1);
		System.out.println(st1.hashCode());
		

	}

}
