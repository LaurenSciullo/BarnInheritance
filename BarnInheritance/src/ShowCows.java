
public class ShowCows extends Stockyard
	{
		public ShowCows()
		{
			name = "Show Cows";
		}

		@Override
		public void trainers()
			{
				System.out.println(name);
				System.out.println("Andrew Carnegie");
				
			}
		
		public void pedigree()
		{
			System.out.println("Show cows have an excellent pedigree");
		}
		
		

	}
