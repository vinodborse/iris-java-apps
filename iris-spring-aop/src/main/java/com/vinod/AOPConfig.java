package com.vinod;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPConfig {
	
	@Before("allGet()")
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@After("allGet()")
	public void afterMethod() {
		System.out.println("After method"); 
	}
	
	@Pointcut("within(com.vinod.model.Employee)")
	public void allGet() {}
	
	
	@Around("execution(public void display())")
	public void around( ProceedingJoinPoint pojp) throws Throwable {

			System.out.println("We are Starting the DISPLAY method");
			pojp.proceed();
			System.out.println("We have ended the DISPLAY method");

	}
}


/*
 * @Aspect
 * 
 * @After
 * 
 * @Before
 * 
 * @PointCut
 * 
 * @AfterReturing
 * 
 * @AfterThrowing
 * 
 * @Around
 */
