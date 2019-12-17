
public class ShowHorses extends Capricorn
	{
		public ShowHorses() 
		{
			name = "Show Horses";
			
		
		}
		
		public void breed()
		{
			System.out.println("Show Horses are typically Warm Bloods: Oldenburgs, Holsteiners");
		}

	@Override
	public void trainers()
		{
			System.out.println(name);
			System.out.println("Trace Ferguson");
			
		}
	
	public void jumpers()
	{
		System.out.println("jump horses");
	}

	}
