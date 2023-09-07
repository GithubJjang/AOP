package com.root.aop.Domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

// AOP 적용 대상
@Qualifier(value = "Boy")
@Configuration
public class Boy implements Person {

	@Override
	public void runSomething() {
		System.out.println("컴퓨터로 게임을 한다.");
		
	}
	
	@Override
	public String toString() {
		return "I am Boy";
	}
	
}
