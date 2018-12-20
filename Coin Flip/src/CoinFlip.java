//rand num example starter (coin flip)
import java.util.Random;


public class CoinFlip {

	public static void main(String [] args)
	{
	//enter a "seed" value for the Random method parameter	
		Random rnd = new Random(System.currentTimeMillis()); //sift rnd result
		int value = rnd.nextInt();
		//if ((rnd.nextInt() % 1) == 1 )
			System.out.println(value % 10  );
		
		//else
			
		//	System.out.println(rnd.nextInt()  );
	}

}
//In the above example notice in the run you can go from a positive to negative range as follows in a possible result set
//{-9,-8,-7,-3,-2,-1...0,1,2,3,7,8,9,}

