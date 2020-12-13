package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;

@SpringBootApplication
@ComponentScan( basePackages = { "guru.services", "guru.springframework" } )
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController myController = (MyController)ctx.getBean( "myController" );
		
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean( FakeJmsBroker.class );
		System.out.println( fakeJmsBroker.getUsername() );
		
		FakeDataSource fakeDAtaSource = (FakeDataSource) ctx.getBean( FakeDataSource.class );
		System.out.println( fakeDAtaSource.getPath() );
		System.out.println( fakeDAtaSource.getUser() );

		
		
		//I18nController i18Controler = (I18nController)ctx.getBean( "i18nController" );
		//System.out.println( i18Controler.sayHello() );
		
		//MyController myController = (MyController)ctx.getBean( "myController" );
		//System.out.println( "---- Primary Bean" );
		//System.out.println( myController.sayHello() );
		
		//System.out.println( "---- Property" );
		//PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean( "propertyInjectedController" );
		//System.out.println( propertyInjectedController.getGreeting() );
		
		//System.out.println( "---- Setter" );
		//SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean( "setterInjectedController" );
		//System.out.println( setterInjectedController.getGreeting() );
		
		//System.out.println( "---- Constructor" );
		//ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean( "constructorInjectedController" );
		//System.out.println( constructorInjectedController.getGreeting() );
	}

}
