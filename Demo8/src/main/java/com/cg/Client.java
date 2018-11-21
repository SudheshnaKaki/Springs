/*package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@ComponentScan("com.cg")
@EnableAutoConfiguration
@PropertySource("classpath:/user.properties")
public class Client {
	
public static void main(String[] args) {
		
		ApplicationContext factory = SpringApplication.run(User.class,args);
		User user = (User) factory.getBean("user");
		String username = user.getUserName();
		String password = user.getPassWord();
		int userId = user.getUserId();
		System.out.println(username);
		System.out.println(password); 
		System.out.println(userId);
}
}
*/