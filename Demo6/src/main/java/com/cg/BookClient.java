package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookClient {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(MyBookConfig.class);
		Book book = (Book) factory.getBean("book");
		System.out.println(book.hashCode());
		System.out.println(book);
	}

}
