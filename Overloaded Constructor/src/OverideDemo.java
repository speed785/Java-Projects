//Demo for method overriding
class Override {
 void ovlDemo(){
 System.out.println("No parameters");
}

//Override ovlDemo for one integer parameter.
 void ovlDemo(int a) {
  System.out.println("One parameter: " + a);
 }

//Override ovlDemo for two integer parameters.
  int ovlDemo(int a, int b){
  System.out.println("Two parameters: " + a + " " + b);
  return a + b;
 }

//Overloadride ovlDemo for two double parameters.

double ovlDemo(double a, double b) {
  System.out.println("Two double parameters: " + a + " " + b);
  return a + b;
}
}
class OverrideDemo {
 public static void main(String args[]) {
   Override ob = new Override(); //instantiation of object
   int resI;
   double resD;

// call all versions of ovlDemo()
ob.ovlDemo();
System.out.println();

ob.ovlDemo(2);
System.out.println();
 resI = ob.ovlDemo(4,6);
 System.out.println("Result of ob.ovlDemo(4,6): " + resI);

 System.out.println();

 resD = ob.ovlDemo(1.1,2.32);
 System.out.println("Result of ob.ovlDemo(1.1,2.32): " + resD);
}
}
