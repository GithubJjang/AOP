package com.root.aop.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


// AOP는 1.인테페이스 기반, 2.프록시 기반, 3.런타임 기반이다.
@Aspect
@Component
public class MyAspect {
	

	@Pointcut("execution(public * com.root.aop.Domain.Person.runSomething())")
	public void cut() {
		// 무엇을 작성해도 의미가 없다.
	};
	
	// 상위 메서드가 실행되기 전에, 반드시 실행이 되는 메서드.
	@Before("cut()")
	public void before(JoinPoint joinPoint) {
		System.out.println(joinPoint.getTarget().toString());// joinPoint의 객체를 반환.
		// joinPoint에 해당하는 것은 runSomething()임을 알 수 있다.
		// 즉, targetMethod가 joinPoint 지점임.
		
		
		System.out.println();
		System.out.println("얼굴 인식 확인: 문을 개방한다.");
		System.out.println("열쇠로 문을 열고 집에 들어간다.");
	}
	
	@After("cut()")
	public void after() {
		System.out.println("문을 잠근다.");
		System.out.println();
	}
	
	

}
