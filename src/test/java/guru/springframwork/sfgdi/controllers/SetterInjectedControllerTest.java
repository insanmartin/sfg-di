package guru.springframwork.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframwork.sfgdi.services.ConstructorGreetingService;

public class SetterInjectedControllerTest
{
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp()
	{
		//simula lo que hace Spring: crea objeto y la implementacion
		controller = new SetterInjectedController();
		controller.setGreetingService( new ConstructorGreetingService() ); 
	}
	
	@Test
	void getGreeting()
	{
		System.out.println( controller.getGreeting() );
	}

}
