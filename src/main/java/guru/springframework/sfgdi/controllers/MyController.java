package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	//no necesario en constructor
	@Autowired
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
