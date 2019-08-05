package com.nguyenanhtu.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

public class HijackAroundMethod implements MethodInterceptor {
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HijackBeforeMethod : Before method hijacked2!");
	}

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Method name : " + invocation.getMethod().getName());
		
		System.out.println("Method arguments : " + Arrays.toString(invocation.getArguments()));
		
		System.out.println("HijackAroundMethod : Before method hijacked!");
		
		try {
			Object result = invocation.proceed();
			
			System.out.println("HijackAroundMethod : Before after hijacked!");
			
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("HijackAroundMethod : Throw exception hijacked!");
			throw e;
		}
	}
}
