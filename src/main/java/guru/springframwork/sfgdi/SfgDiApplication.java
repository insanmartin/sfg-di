package guru.springframwork.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframwork.sfgdi.controllers.ConstructorInjectedController;
import guru.springframwork.sfgdi.controllers.I18nController;
import guru.springframwork.sfgdi.controllers.MyController;
import guru.springframwork.sfgdi.controllers.PropertyInjectedController;
import guru.springframwork.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18Controler = (I18nController)ctx.getBean( "i18nController" );
		System.out.println( i18Controler.sayHello() );
		
		MyController myController = (MyController)ctx.getBean( "myController" );
		System.out.println( "---- Primary Bean" );
		System.out.println( myController.sayHello() );
		
		System.out.println( "---- Property" );
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean( "propertyInjectedController" );
		System.out.println( propertyInjectedController.getGreeting() );
		
		System.out.println( "---- Setter" );
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean( "setterInjectedController" );
		System.out.println( setterInjectedController.getGreeting() );
		
		System.out.println( "---- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean( "constructorInjectedController" );
		System.out.println( constructorInjectedController.getGreeting() );
	}

}
