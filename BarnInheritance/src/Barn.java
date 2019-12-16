
public abstract class Barn
	{
		
		protected String name;
		//protected String owner;
		
		public abstract void animals();
		public abstract void location();
		public abstract void barnLook();
		public abstract void trainers();
		
		public Barn()
		{
			name = "Barn";
		}
		
		public static void dust()
		{
			System.out.println("All barns have dust. \n");
		
		}

	}
