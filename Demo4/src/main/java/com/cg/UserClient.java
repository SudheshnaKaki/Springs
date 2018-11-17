package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("user.xml"); 
		User user = (User) factory.getBean("user");
		String username = user.getUsername();
		String password = user.getPassword();
		System.out.println(username);
		System.out.println(password); 
}
}