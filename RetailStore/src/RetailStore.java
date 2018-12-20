
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
// James Dumitru
public class RetailStore 
{
  Scanner scan = new Scanner(System.in);
  public static void main(String args[]){
  int[ ][ ] table = makeData();
  int rows = table.length;
  int columns = table[0].length;
  double rowAnalysis[] = new double[rows];
  double columnAnalysis[] = new double[columns];
  for(int i=0; i<rows; i++){
     rowAnalysis[i] = 0.0;
  }
  for(int i=0; i<columns; i++){
     columnAnalysis[i] = 0.0;
  }
  for(int i=0; i<rows; i++){
     for(int j=0; j<columns; j++){
         rowAnalysis[i] += (double)table[i][j];
         columnAnalysis[j] += (double)table[i][j];
     }
  }
  boolean avgGreaterThan10 = false;  
  System.out.println("\n~~~~~~~~~~~~~~~~~ Lanes Analysis ~~~~~~~~~~~~~~~~~\n");
  System.out.println("Lane #\t\tCustomer Count\tAverage");
  for(int i=0; i<rows; i++){
     System.out.println("Lane["+(i+1)+"]: \t"+ rowAnalysis[i] + " \t\t"+rowAnalysis[i]/(double)rows);
     if(rowAnalysis[i]/(double)rows>10.0)
         avgGreaterThan10 = true;
  } 
  
  System.out.println("\n\n~~~~~~~~~~~~~~~~~ Hours Analysis ~~~~~~~~~~~~~~~~~\n");
  System.out.println("Hours #\t\tCustomer Count\tAverage ");
  for(int i=0; i<columns; i++){
     System.out.println("Hours["+(i+1)+"]: \t" + columnAnalysis[i] + " \t\t"+ columnAnalysis[i]/(double)columns);
     if(columnAnalysis[i]/(double)columns>10.0)
         avgGreaterThan10 = true;
     
  }
  System.out.println(); 
  if(avgGreaterThan10){
     System.out.println("\nRemember To Do !! : Schedule another Bagging Clerk ");
     
     
      /*popup-window
	   perform data analysis
	   row analysis
	  /**/ 
     
     
	  String str = JOptionPane.showInputDialog (null, "enter a cashier lane number : ");
	  // subtract 1 to compensate for a zero indexed array
	  int laneNum = Integer.parseInt(str) - 1;
	  double average = 0.0, sum = 0.0;
	  
	  for (int j = 0; j < columns ; j++)  
	  {
		  sum += table[laneNum][j];
	  }
	  average = sum / columns;
	  
	  String outputMsg = "";
	  outputMsg += "\n for cashier lane " + (laneNum + 1);
	  outputMsg += "\n the data analysis is: ";
	  outputMsg += "\n customer count -> " + Math.round(sum);
	  outputMsg += "\n average -> " + Math.round(average);
	  
	  JOptionPane.showMessageDialog(null, outputMsg,"Data Row Analysis", JOptionPane.PLAIN_MESSAGE);
	  
	  // column analysis
	  str = JOptionPane.showInputDialog(null, "enter an hour number : ");
	  // subtract 1 to compensate for a zero indexed array
	  int hourNum = Integer.parseInt(str) - 1;
		
		
	  // reset the accumulating variable
	  sum = 0;	  
	  for (int i = 0; i < rows ; i++)  
	  {
		  sum += table[i][hourNum];
	  }
	  average = sum / rows;
	  outputMsg = "";
	  outputMsg += "\n for hour number " + (hourNum + 1);
	  outputMsg += "\n the data analysis is: ";
	  outputMsg += "\n customer count -> " + Math.round(sum);
	  outputMsg += "\n average -> " + Math.round(average);
	  JOptionPane.showMessageDialog(null, outputMsg,"Data Column Analysis", JOptionPane.PLAIN_MESSAGE);
	  
	  /*
	  gives basic
	  /**/

  }
  }
  public static int[][] makeData(){
  
	  int rows = 6;
	  int columns = 8;
	  int[ ][ ] table = new int[rows][columns];
	 
	  Random randomGen = new Random();
	  StringBuilder s = new StringBuilder();
	  int randomInt1 = 0;
	  int randomInt2 = 0;
	  
	  // generate column titles
	  for (int j = 0; j < columns; j++)
	  {
		  s.append("\thr " + (j + 1));
	  }
	  s.append("\n\n");
	  // populate data for each cashier lane
	  for (int i = 0; i < rows; i++)
	  {
		   s.append("lane " + (i + 1));
          	   s.append("\t");
		  for (int j = 0; j < columns; j++)
		  {
			  // express checkout lane
			  randomInt1 = 1 + randomGen.nextInt(20);
			  // standard checkout lane
			  randomInt2 = 1 + randomGen.nextInt(10);
		

			  if(i == 0) 
				  table[i][j] = randomInt1;
			  else 
				  table[i][j] = randomInt2;
	          s.append(table[i][j]);
	          s.append(" ");
	          s.append("\t");
	      }
		  s.append("\n");
	  }
	  System.out.println("data simulation: \n\n" + s);
	  System.out.println("");
	  return table;
	  
}
}