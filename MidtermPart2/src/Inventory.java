import java.util.Scanner;
//James Dumitru, Programmer
public class Inventory
{
static int itemCount = 0;
static double averageCost = 0;
static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
// begin local variable declaration / initialization zone
char answer = 'Y';
// end local variable declaration / initialization zone
displayMenu();
while(answer == 'Y' || answer == 'y')
{
	
// begin code block to display results
System.out.printf("average cost: $%.2f\n", averageCost());
System.out.println("***************************");
// end code block to display results

//output statement to print the tax
System.out.println("at a level of " + itemCount +" units,the inventory tax is $" + Math.ceil(computeTax())+".");

// begin code block to perform additional program run
System.out.println("run again(Y or N)?");
answer = sc.next().charAt(0);
// end code block to perform additional program run
}
System.out.println("***************************");
}// end main() method

public static void displayMenu() {
// begin program menu
System.out.println("");
System.out.println("");
System.out.println("***************************");
System.out.println("----Inventory Valuation---");
System.out.println("***(Weighted Average Method)***");
System.out.println("");
System.out.println("");
System.out.println("--------- M E N U ---------");
System.out.println("");
}// end program menu

public static double averageCost() {
double average = 0.0, cost = 0.0, totValue = 0.0;
int number = 0, sumItems = 0, quantity = 0;
String item = "";
// begin code block for inventory evaluation
System.out.println("number of item types in the inventory ->");
number = sc.nextInt();
itemCount =number;
for(int i = 1; i <= number; i++)
{
System.out.println("enter the item's description");
item = sc.next();
System.out.println("item description: " + item);
System.out.println("enter item quantity");
quantity = sc.nextInt();
sumItems += quantity;
System.out.println("enter item cost");
cost = sc.nextDouble();
totValue += cost * quantity;
}
// outside the for() loop
average = totValue / sumItems;
averageCost = average;
// end code block for inventory evaluation
return average;
}

public static double computeTax() {
// calculating the tax at a rate of 6 percentage
return itemCount * averageCost * 0.061;
}
}// end class
