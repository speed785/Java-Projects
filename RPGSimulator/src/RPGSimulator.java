import java.util.Random;
// James Dumitru, Programmer
public class RPGSimulator {
		
	public static void main(String args[]) throws InterruptedException
	{
		Random rand1 = new Random();
		Random rand2 = new Random();
								
		String mission1 = "Capture the Castle";
		String mission2 = "Enter the Hidden City";
		String mission3 = "Rescue the Princess";
		String mission4 = "Traverse the Forest";
		String mission5 = "Locate the Tunnel Entrance";
		String mission6 = "Fight the Red-Ribbon Army";
        String mission7 = "Tournament of Power";
        
		String player1 = "", player2 = "";
							
		char letter = '\0', role = '\0';
		
		// initial health and treasures for the two players
		int number = 0, mission = 0, health1 = 100, health2 = 100;
		int treasure1 = 100, treasure2 = 100, encounter = 0;


		// define your role
		role = (char)(rand1.nextInt(26) + 'a');
		if(role >= 'a' && role <= 'm')
		{
		player1 = "picolo";
		player2 = "omega";
		}
		else
		{ 
			player1= "omega";
			player2 = "picolo";
		}
		System.out.println("you are the " + player1);
		
		//-------------------------
		
		// define your mission
		number = rand2.nextInt(7) + 1;
				
		System.out.print("your mission is: ");
		switch(number)
		{
			 case 1: System.out.println(mission1); mission = 1; break;
			 case 2: System.out.println(mission2); mission = 2; break;
		     case 3: System.out.println(mission3); mission = 3; break;
			 case 4: System.out.println(mission4); mission = 4; break;
			 case 5: System.out.println(mission5); mission = 5; break;
			 case 6: System.out.println(mission6); mission = 6; break;
			 case 7: System.out.println(mission7); mission = 7; break;
	    }
		System.out.println("");
		
		// let the game simulation commence (limit the # of encounters)
		for (encounter = 1; encounter <= 10; encounter++)
		{
		   if(encounter>5)
		   {
		   health2 += 15; //bonus health
		   treasure1 += 10; // treasure points
		   }
		letter = (char)(rand1.nextInt(5) + 'a');
		number = rand2.nextInt(10) + 1;

		// randomly encounter the enemy
		if(letter == 'a' || letter == 'b')
		//if(mission == 1 || mission == 2 || mission == 3)
		{
		health1 -= 10;
		health2 += 15;
		treasure1 -= 10;
		treasure2 += 10;
		if (health1 <= 0){ health1=0;}
		if (health2 <= 0){ health2=0;}
		if (health1 > 100){ health1=100;}
		if (health2 > 100){ health2=100;}
		if (treasure1 <= 0){ treasure1 =0;}
		if (treasure2 <= 0){ treasure2 =0;}
		if (mission == 1) { health1=100;}
		if (mission == 1) { health2=100;}
		
		//Thread.sleep(5000);
		System.out.print("battle: " + encounter);
		System.out.println("\t" + "health" + "\t" + "treasure");
		System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
		System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
		System.out.println("");
		//encounter++;
		}	
		else if(letter == 'c' || letter == 'd')
			{
			  health1 += 20;
			  health2 -= 30;
			  treasure1 += 40;
			  treasure2 -= 20;
			  if (health1 <= 0){ health1=0;}
			  if (health2 <= 0){ health2=0;}
			  if (health1 > 100){ health1=100;}
			  if (health2 > 100){ health2=100;}
			  if (treasure1 <= 0){ treasure1 =0;}
			  if (treasure2 <= 0){ treasure2 =0;}
	   
	          //Thread.sleep(500);
				System.out.print("battle: " + encounter);
				System.out.println("\t" + "health" + "\t" + "treasure");
				System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
				System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
				System.out.println("");
				//break;
			 }
		else if(letter == 'e' || letter == 'f')
				//if(mission == 1 || mission == 2 || mission == 3)
				{
				health1 -= 20;
				health2 += 25;
				treasure1 -= 20;
				treasure2 += 10;
				if (health1 <= 0){ health1=0;}
				if (health2 <= 0){ health2=0;}
				if (health1 > 100){ health1=100;}
				if (health2 > 100){ health2=100;}
				if (treasure1 <= 0){ treasure1 =0;}
				if (treasure2 <= 0){ treasure2 =0;}
				  
				//Thread.sleep(5000);
				System.out.print("battle: " + encounter);
				System.out.println("\t" + "health" + "\t" + "treasure");
				System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
				System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
				System.out.println("");
				//encounter++;
			 }
				else
			 {
				health1 += 30;
				health2 -= 20;
				treasure1 -= 30;
				treasure2 += 20;
				if (health1 <= 0){ health1=0;}
				if (health2 <= 0){ health2=0;}
				if (health1 > 100){ health1=100;}
				if (health2 > 100){ health2=100;}
				if (treasure1 <= 0){ treasure1 =0;}
				if (treasure2 <= 0){ treasure2 =0;}
				
				//Thread.sleep(500);
				System.out.print("battle: " + encounter);
				System.out.println("\t" + "health" + "\t" + "treasure");
				System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
				System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
				System.out.println("");
				//break;
			  }
				health1 -= 5;
				health2 -= 5;
				treasure1 -= 5;
				treasure2 -= 5;
				if (health1 <= 0){ health1=0;}
				if (health2 <= 0){ health2=0;}
				if (health1 > 100){ health1=100;}
				if (health2 > 100){ health2=100;}
				if (treasure1 <= 0){ treasure1 =0;}
				if (treasure2 <= 0){ treasure2 =0;}
				if (health1 <= 0 || health2 <= 0 || treasure1 <= 0 || treasure2 <= 0)
			  {
				//System.out.print("encounter: " + encounter + " action status: ");
				break;
			  }
			}
				System.out.println("simulation has ended\n");
				System.out.println("results:\n");
				System.out.println("\t\t" + "health" + "\t" + "treasure");
				System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
				System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
				}
	}
