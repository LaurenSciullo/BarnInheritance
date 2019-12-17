
public class BarnRunner
	{

		public static void main(String[] args)
			{
				System.out.print(Barn.class.getName() + "!\n");
				Barn.dust();

				
				Barn[] herd = new Capricorn[2];
				herd[0] = new ShowHorses();
				herd[1] = new NonShowHorses();
			
				
				Barn[] pen = new Stockyard[2];
				pen[0] = new ShowCows();
				pen[1] = new NonShowCows();
				
				ShowHorses genHorse = new ShowHorses();
				System.out.println("General horses herd:");
				genHorse.animals();
				genHorse.location();
				genHorse.barnLook();
				System.out.println();
				
				System.out.println("Two types of horses:");
				for(Barn b: herd)
					{
						
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
				
				ShowCows genCow = new ShowCows();
				System.out.println("General cow pen:");
				genCow.animals();
				genCow.location();
				genCow.barnLook();
				System.out.println();
	
				System.out.println("Two types of Cows:");
				for (Barn b: pen)
					{
						
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
				
				System.out.println("Show Horse Congo:");
				ShowHorses Congo = new ShowHorses();
				Congo.trainers();
				Congo.jumpers();
				Congo.breed();
				System.out.println();
				
				System.out.println("Non Show Horse Mijo:");
				NonShowHorses Mijo = new NonShowHorses();
				Mijo.trainers();
				Mijo.eat();
				Mijo.breed();
				System.out.println();
				
				System.out.println("Show Cow Benedictine:");
				ShowCows Benedictine = new ShowCows();
				Benedictine.trainers();
				Benedictine.pedigree();
				System.out.println();
				
				System.out.println("Non Show Cow Jeremiah:");
				NonShowCows Jeremiah = new NonShowCows();
				Jeremiah.trainers();
				Jeremiah.fat();
				

			}

	}
