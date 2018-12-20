import java.util.Scanner;

public class Demograph {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String strName = "";
		// greeting the user & promts user for their name
		System.out.println("Welcome! Please enter your name");
		strName = sc.nextLine();
		//display the name back to the user
		System.out.println("Hello " + strName + ". What city do you live in?");
		strName = sc.nextLine();
		System.out.println("What state do you live in?");
		strName = sc.nextLine();
		System.out.println("What country do you live in?");
		strName = sc.nextLine();
		System.out.println("How many courses are you taking?");
		strName = sc.nextLine();
		System.out.println("How many credit hours are you taking?");
		strName = sc.nextLine();
		System.out.println("Do you like JAVA? Answer Y for yes or N for No");
		strName = sc.nextLine();
	}
}