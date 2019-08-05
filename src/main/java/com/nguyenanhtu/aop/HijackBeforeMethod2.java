package com.nguyenanhtu.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod2 implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HijackBeforeMethod : Before method hijacked2!");
	}
}
