
public class NonShowHorses extends Capricorn
	{
		
		public NonShowHorses()
		{
			name = "Non Show Horses";
		
		}
		
		public void breed()
		{
			System.out.println("Non Show Horses are typically pleasure/work horses: Quarter Horses, Drafts");
		}

	@Override
	public void trainers()
		{
			System.out.println(name);
			System.out.println("Debbie Bergman");
			
		}
	
	public void eat()
	{
		System.out.println("Non show horses eat all day");
	}

	}
