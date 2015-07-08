package org.raju.Aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(public String org.raju.Aop.model.Circle.getName())")
	public void LoggingAdvice(){
		System.out.println("Print this message...");
		//I add this line as a checkup
	}

}
