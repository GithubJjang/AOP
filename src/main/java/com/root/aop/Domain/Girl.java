package com.root.aop.Domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

// AOP 적용 대상
@Qualifier(value = "Girl")
@Configuration
public class Girl implements Person {

	@Override
	public void runSomething() {
		System.out.println("요리를 한다.");
		
	}
	@Override
	public String toString() {
		return "I am Girl";
	}

}
