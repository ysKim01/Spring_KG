package com.spring.ex01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[�޼��� ȣ�� �� : LoggingAdvice");
		System.out.println(invocation.getMethod() + " �޼��� ȣ�� ��");
		
		Object object =invocation.proceed();
		
		System.out.println("[�޼��� ȣ�� �� : LoggingAdvice");
		System.out.println(invocation.getMethod()+" �޼��� ȣ�� ��");
		return object;
	}

}
