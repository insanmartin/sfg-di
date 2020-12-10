package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingService;

public class ConstructorInjectedControllerTest
{
	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp()
	{
		//simula lo que hace Spring: crea objeto y la implementacion
		controller = new ConstructorInjectedController( new ConstructorGreetingService() );
	}
	
	@Test
	void getGreeting()
	{
		System.out.println( controller.getGreeting() );
	}

}
