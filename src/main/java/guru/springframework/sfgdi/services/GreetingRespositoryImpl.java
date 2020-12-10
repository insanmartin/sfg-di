package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRespositoryImpl implements GreetingRepository
{
	@Override
	public String getSpanishGreeting() 
	{
		return "Hola muchachos";
	}

	@Override
	public String getEnglishGreeting() 
	{
		return "Hi guys!";
	}

	@Override
	public String getGermanGreeting()
	{
		return "Halo Wilkommen!";
	}
	

}
