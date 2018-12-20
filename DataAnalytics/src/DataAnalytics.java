
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
// James Dumitru : Data Analysis with Java File Processing
class DataAnalytics{
public static void main(String args[]){
	
  // declare an object to receive the data
  Scanner scan = new Scanner(System.in);
  // declare an array list to hold the data
  ArrayList<Integer> list;
  list = new ArrayList<Integer>();
  int count = 0;
  int num = 0;
  int val = 0;
  String line = "";

  try
  {
    // create or append to the file 
    FileWriter fileOut = new FileWriter("outData.txt");
    BufferedWriter fout = new BufferedWriter(fileOut);
    
    System.out.println("how many data items?");
    count = scan.nextInt();
    for (int i = 1; i <= count; i++)
    {
      System.out.println("enter a data value");
      val = scan.nextInt();
      fout.write(val + "\n");
    }
    System.out.println("thank you ... the data has been recorded!");
    
    // close the output stream objects
    fout.close();
    fileOut.close();

    scan.close();
    
    // read the data
    FileReader fileIn = new FileReader("outData.txt");
    BufferedReader fin = new BufferedReader(fileIn);
    
    while ((line = fin.readLine()) != null)
    {
     	num = Integer.parseInt(line);
    	list.add(num);
      System.out.println(num);
    }
    System.out.println("thank you ... the data has been received!");
    fin.close();
    fileIn.close();
    //unsorted data
    System.out.println("display unsorted data");
	DisplayData(list);
	BubbleSort(list);
	//sorted data
	System.out.println("display sorted data");
	DisplayData(list);
	
	MaxMin(list);
	System.out.println("Average :" + Average(list));
	System.out.println("Perfect Squares:");
	PerfectSquares(list);
  }
  catch(Exception e)
  {
    // catch an exception if any arises
    System.err.println("Error: " + e.getMessage());
  }
}
public static void DisplayData(ArrayList<Integer> num)
{
	for (int i = 0; i < num.size(); i++)  
		 System.out.println(num.get(i).toString());
	}
public static void BubbleSort(ArrayList<Integer> num)
{
  int j = 0;
  boolean flag = true;  // set the flag to true to begin first pass
  int temp = 0;  // define the holding variable
  while (flag)
  {
    flag = false; //set flag to false awaiting a possible swap
    for (j = 0; j < num.size() - 1; j++)
    {
      if (num.get(j) > num.get(j + 1)) 
      // for descending sort change to <
      {
        temp = num.get(j); //swap the elements
        num.set(j, num.get(j + 1));
        num.set(j + 1, temp);
        flag = true; //shows a swap occurred  
	} 
    } 
  } 
} 
// VVV will show Maximum and the Minimum
public static void MaxMin(ArrayList<Integer> num){
	System.out.println("Min :" + num.get(0));
	System.out.println("Max :" + num.get(num.size() - 1));
}
//VVV will present the Average
public static double Average(ArrayList<Integer> num){
    int total = 0;
for (int i = 0; i < num.size(); i++) {
    total += num.get(i);
}
    return (double) total / num.size();
}
// VVV will present the perfect squares
public static void PerfectSquares(ArrayList<Integer> num) {
for (int i = 0; i < num.size(); i++) {
   double sqrt = Math.sqrt(num.get(i));
   int x = (int) sqrt;
if (Math.pow(sqrt, 2) == Math.pow(x, 2)) {
	System.out.println(num.get(i) + " ");
}
}
System.out.println();
}
}

