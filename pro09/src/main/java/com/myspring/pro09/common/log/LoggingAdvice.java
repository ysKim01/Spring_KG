package com.myspring.pro09.common.log;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
	private static final Logger logger
		= LoggerFactory.getLogger(LoggingAdvice.class);
	
	@Before("execution(* com.myspring.pro09.*.service.*.*(..)) or "
			+ "execution(* com.myspring.pro09.*.dao.*.*(..))")
	public void startLog(JoinPoint jp) {
		logger.info("-------------------------------------------");
		logger.info("-------------------------------------------");
		
		logger.info("1 : "+Arrays.toString(jp.getArgs()));
		// 전달되는 모든 파라미터들을 Object의 배열로 가지고 온다.
		
		logger.info("2 : "+jp.getKind());
		// 해당 Advice의 타입을 알아낸다.
		
		logger.info("3 : "+ jp.getSignature().getName());
		// 실행하는 대상 객체의 메서드에 대한 정보를 알아 낼 때 사용한다.
		
		logger.info("4 : " + jp.getTarget().toString());
		// target 객체를 알아 낼 때 사용한다.
		
		logger.info("5 : "+ jp.getThis().toString());
		// Advice를 행하는 객체를 알아 낼 때 사용한다.
		
	}
	
	@After("execution(* com.myspring.pro09.*.service.*.*(..)) or execution(* com.myspring.pro09.*.dao.*.*(..))")
	public void after(JoinPoint jp) {
		logger.info("-------------------------------------------");
		logger.info("-------------------------------------------");
		
		logger.info("1 : "+Arrays.toString(jp.getArgs()));
		// 전달되는 모든 파라미터들을 Object의 배열로 가지고 온다.
		
		logger.info("2 : "+jp.getKind());
		// 해당 Advice의 타입을 알아낸다.
		
		logger.info("3 : "+ jp.getSignature().getName());
		// 실행하는 대상 객체의 메서드에 대한 정보를 알아 낼 때 사용한다.
		
		logger.info("4 : " + jp.getTarget().toString());
		// target 객체를 알아 낼 때 사용한다.
		
		logger.info("5 : "+ jp.getThis().toString());
		// Advice를 행하는 객체를 알아 낼 때 사용한다.
	}
	
	// target 메서드의 동작 시간을 측정한다.
	@Around("execution(* com.myspring.pro09.*.service.*.*(..)) or execution(* com.myspring.pro09.*.dao.*.*(..))")
	public Object timeLog(ProceedingJoinPoint pjp) throws Throwable{
		long startTime = System.currentTimeMillis();
		logger.info(Arrays.toString(pjp.getArgs()));
		
		Object result = pjp.proceed();
		
		long endTime = System.currentTimeMillis();

		logger.info(pjp.getSignature().getName()+" : "+(endTime - startTime));
		logger.info("======================================================");
		
		return result;
		// Around를 사용할 경우 반드시 Object를 리턴해야 한다.
	}


}
















