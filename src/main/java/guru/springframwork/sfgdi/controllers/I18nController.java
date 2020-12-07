package guru.springframwork.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframwork.sfgdi.services.GreetingService;

@Controller
public class I18nController {

	private final GreetingService greetingService;
	
	//no necesario en constructor
	@Autowired
	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
