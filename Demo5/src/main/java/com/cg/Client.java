package com.cg;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext factory = new ClassPathXmlApplicationContext("client.xml"); 
	MessageSource messageSource = (MessageSource) factory.getBean("messageSource");
	Locale locale = new Locale("en","GB");//lang ,country
	String msg = messageSource.getMessage("welcome.message",null,locale);
	System.out.println(msg);
}
}
