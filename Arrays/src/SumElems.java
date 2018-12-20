public class SumElems {
   public static double sumElems (double[ ][ ] arrayElems){
   double sum = 0;
   for (int row=0; row < arrayElems.length; row++){
	   for (int col=0; col < arrayElems[row].length; col++){
	   sum = sum + arrayElems [row][col];
   		}
   }
   return sum;
   }
public static void main(String[] args) {
   double a[][] = {
       { 1.2, 2 }, // row 0
       { 6,7.2 }, // row 1
       { 11, 12 }
   };
   System.out.println(sumElems(a));
	}
}