package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
public static void main(String[] args) {
	ApplicationContext factory = new ClassPathXmlApplicationContext("employee.xml");
	Employee employee = (Employee) factory.getBean("employee");
	/*System.out.println("Employee Details\n----------------");
	System.out.println("Employee id:"+employee.getEmployeeId());
	System.out.println("Employee name:"+employee.getEmployeeName());
	System.out.println("Employee salary:"+employee.getSalary());
	System.out.println("Employee businessUnit:"+employee.getBusinessUnit());
	System.out.println("Employee Age:"+employee.getAge());*/
	System.out.println(employee);
}
}
