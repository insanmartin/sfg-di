package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryGermanGreetingService implements GreetingService
{
	private GreetingRepository greetingRepository = null;
	
	//no necesario por ser constructor
	@Autowired
	public PrimaryGermanGreetingService( GreetingRepository greetingRepository )
	{
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting()
	{
		return greetingRepository.getGermanGreeting();
	}

}
