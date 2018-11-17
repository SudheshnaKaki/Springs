package com.cg;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CurrencyListClient {
	public static void main(String[] args){
	
		
	ApplicationContext factory = new ClassPathXmlApplicationContext("currencylist.xml");
	CurrencyList currencyList = (CurrencyList) factory.getBean("currencyList");
	List<String> clist = currencyList.getCurrList();
	System.out.println(clist);
	}
}
