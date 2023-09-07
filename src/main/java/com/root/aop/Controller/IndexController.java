package com.root.aop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.root.aop.Domain.Person;

@RestController
public class IndexController {
	
	@Autowired @Qualifier("Boy")
	Person Boy;
	
	@Autowired @Qualifier("Girl")
	Person Girl;

	@GetMapping("/")
	public String index() {
		Boy.runSomething();
		Girl.runSomething();
		return "index";
	}
}
