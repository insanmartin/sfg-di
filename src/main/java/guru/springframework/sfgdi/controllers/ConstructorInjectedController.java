package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.services.GreetingService;

@Controller
public class ConstructorInjectedController 
{
	public GreetingService greetingService;

	//no necesario en constructor
	@Autowired
	public ConstructorInjectedController( @Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
}
