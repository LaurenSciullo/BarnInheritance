
public class BarnRunner
	{

		public static void main(String[] args)
			{
				System.out.println(Barn.class.getName() + ":\n");
				Barn.dust();

				
				Barn[] herd = new Capricorn[2];
				herd[0] = new ShowHorses();
				herd[1] = new NonShowHorses();
			
				
				Barn[] pen = new Stockyard[2];
				pen[0] = new ShowCows();
				pen[1] = new NonShowCows();
				
				for(Barn b: herd)
					{
						b.animals();
						b.location();
						b.barnLook();
						if(b == herd[0])
						{
							
							b.trainers();
							((ShowHorses)b).jumpers();
						}
						else
					    {
					    	
							b.trainers();
							((NonShowHorses)b).eat();
						}
						
						System.out.println();
					}
				
	
				for (Barn b: pen)
					{
						b.animals();
						b.location();
						b.barnLook();
						if(b == pen[0])
							{
						
						b.trainers();
						((ShowCows)b).pedigree();
							}
						else
							{
						
						b.trainers();
						((NonShowCows)b).fat();
							}
						
						System.out.println();
					}
				

			}

	}
