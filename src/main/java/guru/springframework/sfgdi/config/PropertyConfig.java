package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource( { "classpath:datasource.properties", "jms.properties" } )
@PropertySources( {
	@PropertySource( "classpath:datasource.properties" ),
	@PropertySource( "classpath:jms.properties" )
} )
public class PropertyConfig 
{
	//para que enlace el valor con la propiedad (campo) del fichero de propiedades
	//variables de properties datasource.properties
	
	@Value( "${guru.username}" )
	String user;
	
	@Value( "${guru.password}" )
	String password;
	
	@Value( "${guru.dburl}" )
	String url;
	
	//@Value( "${path}" )
	//String path;

	@Autowired
	Environment env;
	
	//desde aqui variables de properties jms.properties
	@Value( "${guru.jms.username}" )
	String jmsUsername;
	
	@Value( "${guru.jms.password}" )
	String jmsPassword;
	
	@Value( "${guru.jms.url}" )
	String jmsUrl;

	//desde aqui ejemplo usa application.properties (defecto)
	@Value( "${guru.username2}" )
	String user2;

	@Value( "${guru.jms.username2}" )
	String jmsUsername2;

	//desde aqui ejemplo usa application.yml (defecto)
	//@Value( "${guru.username2}" )
	//String user2;

	//@Value( "${guru.jms.username3}" )
	//@Value( "${hola}" )
	//String jmsUsername3;
	
	
	//Genera un bean de Spring con la configuracion sacada del properties
	@Bean
	public FakeDataSource fakeDataSource()
	{
		FakeDataSource fakeDataSource = new FakeDataSource();
		//fakeDataSource.setUser( user );
		fakeDataSource.setUser( user2 );
		fakeDataSource.setPassword( password );
		fakeDataSource.setUrl( url );
		//fakeDataSource.setPath( path );
		fakeDataSource.setPath( env.getProperty( "path" ) );
		
		return fakeDataSource;
	}

	//Genera un bean de Spring con la configuracion sacada del properties
	@Bean
	public FakeJmsBroker fakeJmsBroker()
	{
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		//fakeJmsBroker.setUsername( jmsUsername );
		fakeJmsBroker.setUsername( jmsUsername2 );
		//fakeJmsBroker.setUsername( jmsUsername3 );
		fakeJmsBroker.setPassword( jmsPassword );
		fakeJmsBroker.setUrl( jmsUrl );
		
		return fakeJmsBroker;
	}
	
	//Genera un bean de Spring que es el encargdo de leer el fichero de propiedades
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties()
	{
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
