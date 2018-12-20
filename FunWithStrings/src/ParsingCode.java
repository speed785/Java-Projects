public class ParsingCode
{
  public static void main(String args[])
  {
	  //Parsing methods
	// declare some strings
    String price ="100";                 
    String rate = "5.8f";
    String tax ="50.2";
    
    // performing parsing operations on strings	
    int x = Integer.parseInt(price);
    float f1 = Float.parseFloat(rate);
    double y = Double.parseDouble(tax);
 
    //display data types
    System.out.println("\nPrinting data type values after parsing string values");
    System.out.println("int value: " + x);
    System.out.println("float value: " + f1);
    System.out.println("double value: " + y);
    System.out.println("");
    // another style of converting strings into data types, very less used               
    //Construct wrapper objects from the string values
    //Wrapping
    Integer i1 = new Integer(price);
    Float f2 = new Float(rate);
    Double d1 = new Double(tax);
    
   // extracting data types from wrapper objects
    //Unwrapping
    int x1 = i1.intValue();
    float f3 = f2.floatValue();
    double d2= d1.doubleValue();
 
    System.out.println("\nPrinting data type values after conversion from Wrapper Object");
    System.out.println("int value: " + x1);
    System.out.println("float value: " + f3);
    System.out.println("double value: " + d2);
  }
}
