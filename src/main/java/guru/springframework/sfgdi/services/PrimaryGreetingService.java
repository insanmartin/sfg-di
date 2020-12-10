package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryGreetingService implements GreetingService
{
	private GreetingRepository greetingRepository = null;
	
	//no necesario por ser constructor
	@Autowired
	public PrimaryGreetingService( GreetingRepository greetingRepository )
	{
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting()
	{
		return greetingRepository.getEnglishGreeting();
	}

}
