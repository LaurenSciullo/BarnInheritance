
public class BarnRunner
	{

		public static void main(String[] args)
			{
				
				Barn[] superClass = new Barn[2];
				superClass[0] = new ShowHorses();
				superClass[1] = new NonShowHorses();
				
				/*Barn[] polymorph = new ShowHorses[1];
				Barn[] polymorph2 = new NonShowHorses[1];
				ShowHorses[] subEverything = new ShowHorses[1];
				NonShowHorses[] subEverything2 = new NonShowHorses[1]; */
				
				for(Barn b: superClass)
					{
						b.trainers();
						//b.animals();
						//b.barnLook();
						//b.location();
						
						
						System.out.println();
					}
				
				

			}

	}
