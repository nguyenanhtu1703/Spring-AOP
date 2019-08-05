package com.nguyenanhtu.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class HijackAfterMethod implements AfterReturningAdvice {
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HijackBeforeMethod : Before method hijacked3!");
	}

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("HijackBeforeMethod : after method hijacked!");
	}
}
