import java.util.Scanner;

public class IntegerDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strName = "";
		//local variables
		int num1 = (int) 0; 
		float num2 = (float) 0;
		
		System.out.println("Hello! Please enter value for number 1." );
		double xvalue = sc.nextFloat();
		System.out.println("Now please enter value for number 2.");
		Float yvalue = sc.nextFloat();
		
		float division_1, division_2;
		   num1 = (int) xvalue; //num1
		   num2 = yvalue; //num2
		   division_1 = (float) (num1 / num2);
		   division_2 = (float) (num2 / num1);
		
		System.out.println("Number 1 divided by number 2 is: " + division_1 );
		strName = sc.nextLine();
		System.out.println("Number 2 divided by number 1 is: " + division_2);		
		 
	}
}
