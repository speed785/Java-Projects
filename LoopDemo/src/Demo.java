class Demo {
  public static void main (String args[]) {
	  int x=0,y=0;
	  //display x, y before entering the loop
	  System.out.println("");
	  System.out.println("Current value of x = " + x);
      System.out.println("Current value of y = " + y);
      System.out.println("");
	for ( x=0; x<5; x++)
{ //display values inside the loop
      //   System.out.println("Current value of x = " + x);
	    for ( y=0; y<3; y++)
	    	     System.out.println("Current value of y = " + y);
           System.out.println("Current value of y = " + y);
         }
	//display values after the loop
	  System.out.println("");
	  System.out.println("Current value of x = " + x);
      System.out.println("Current value of y = " + y);
     }
}
