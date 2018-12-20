import java.lang.Math; 

import java.util.Scanner;
class ScannerClassExample{
public static void main(String args[])	 {
  //declare a Scanner class object
  Scanner sc = new Scanner(System.in);
	
  //prompt user for their name
  System.out.println("Please enter your name");
	
  //declare a local variable and read the integer
  String name = sc.nextLine();
	
  //display the name back to the user and prompts user for w value
  System.out.println("Hello " + name + ", please enter any number as a test: ");
  Float num = sc.nextFloat();
		  
  //prompt user for a number for x value
  System.out.println("Please enter x");
  Float xvalue = sc.nextFloat();
  
  //prompt user for a number for y value
  System.out.println("Please enter y");
  Float yvalue = sc.nextFloat();
//adding x and y
   float x, y, addition;
   x = xvalue;
   y = yvalue;
   addition = x + y;
   
  //display the addition of x and y back to the user
  System.out.println("The sum of x and y equals: " + addition);
  
  float subtract;
  subtract = y - x;
//display the subtraction of y from x back to the user
  System.out.println("The subtraction of y from x equals: " + subtract);
  
  float w;
  w = x * y; 
//display the product of x and y back to the user
  System.out.println("The product of y and x equals: " + w);
  
  float quotient;
  quotient = x / y;
//display the quotient of x by y back to the user
  System.out.println("The quotient of x by y equals: " + quotient);
  w = x % y;
  //display modulus of x by y assigned to variable w
  System.out.println("The modulus of x and y equals to w:" + w);
  
  float z;
  z = y / x;
 //display the quotient of y by x equals to variable z back to user
  System.out.println("The quotient of y by x equals to z: " + z);
  
  double result = Math.pow( x, y);
  System.out.println("X to the exponent of y equals: " + result);
  // dismiss the Scanner class object
  sc.close();
}
} 