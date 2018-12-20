//calculation of the sum of n integers
//using the method of Gauss
import java.util.Scanner;
public class Gauss
{
	private static Scanner scanner;
  public static void main(String args[])
  {
   //build scanner, prompt user and get input
   scanner = new Scanner(System.in);
   System.out.print ("Enter n: ");
   int n = scanner.nextInt();
  //calculate sum
   int sum = 0; // initializing sum at 0
   for (int k=1; k<=n; k++)
    {
      sum += k; //add k onto the sum
      System.out.print( "+" + k);//output
  }
   //final output
 System.out.println( " = " + sum);
 sum=n*(n+1)/2;
 System.out.println("Using Gauss method, the sum is " + sum);
}
}
