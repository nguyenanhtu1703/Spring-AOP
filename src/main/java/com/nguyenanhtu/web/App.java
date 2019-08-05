package com.nguyenanhtu.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nguyenanhtu.customer.services.CustomerService;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");
		CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
	
		System.out.println("*******************");
		cust.printName();
		System.out.println("*******************");
		cust.printURL();
		System.out.println("*******************");
		try {
			cust.printThrowException();
		} catch (Exception e) {
		}
	}
}
