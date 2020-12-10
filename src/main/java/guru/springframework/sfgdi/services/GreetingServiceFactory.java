package guru.springframework.sfgdi.services;

public class GreetingServiceFactory 
{
	private GreetingRepository greetingRepository = null;

	public GreetingServiceFactory( GreetingRepository greetingRepository )
	{
		super();
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService( String lang )
	{
		switch( lang )
		{
			case "en":
				return new PrimaryGreetingService( greetingRepository );
			case "de":
				return new PrimaryGermanGreetingService( greetingRepository );				
			case "es":
				return new PrimarySpanishGreetingService( greetingRepository );
			default:
				return new PrimaryGreetingService( greetingRepository );				
		}
	}
}
