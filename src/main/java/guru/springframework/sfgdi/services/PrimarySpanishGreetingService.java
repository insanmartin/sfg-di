package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PrimarySpanishGreetingService implements GreetingService
{
	private GreetingRepository greetingRepository = null;
	
	//no necesario por ser constructor
	@Autowired
	public PrimarySpanishGreetingService( GreetingRepository greetingRepository )
	{
		super();
		this.greetingRepository = greetingRepository;
	}



	@Override
	public String sayGreeting()
	{
		return greetingRepository.getSpanishGreeting();
	}

}
