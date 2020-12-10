package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.services.ConstructorGreetingService;

public class PropertyInjectedControllerTest
{
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp()
	{
		//simula lo que hace Spring: crea objeto y la implementacion
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingService(); 
	}
	
	@Test
	void getGreeting()
	{
		System.out.println( controller.getGreeting() );
	}

}
