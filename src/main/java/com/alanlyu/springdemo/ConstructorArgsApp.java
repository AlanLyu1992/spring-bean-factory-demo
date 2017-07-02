package com.alanlyu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConstructorArgsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the application context(container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		//invoke the company slogan via the bean
		org.corporateSlogan();
		
		//Print organization details
		System.out.println(org);
		
		//close the application context
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
