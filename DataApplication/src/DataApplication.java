
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
// Programmer: James Dumitru 
//This program is good for listing people when hiring and asking for a price
public class DataApplication {	
public static void searchData(ArrayList<String> vals){
	//Ask for name of person
   System.out.print("Please enter a name: ");
   Scanner sc = new Scanner(System.in);
   String strName = sc.nextLine().trim(); 
   boolean found = false;

   for (int i = 0; i < vals.size(); i++) 
   {
	if(vals.get(i).equals(strName.trim()))
	{
	  found = true;
	  break;
    	}
   }
   if(found == true)
	   //Data found or not
      System.out.println(" Data found ");
   else
      System.out.println(" Data not found ");
   sc.close();
}
public static void excessFeeConsultants(ArrayList<String> vals) {
	//For the expensive people $$$$
	System.out.println("List of consultants who charge more then $2000 ");
	System.out.println("<>~~~~~~~~~~~<>~~~~~~~~~~~<>~~~~~~~~~~<>~~~~~~~~<>");
	for (int i = 2; i < vals.size(); i = i + 2) {
		if (Integer.valueOf(vals.get(i)) > 2000) {
			System.out.println(vals.get(i - 1));
			}
		}
	}
public static void showMediaServicesConsultant(ArrayList<String> vals) {
	//The two Media guys, Roberts & Paul 
	System.out.println("List of Consultants for Media Services:");
	System.out.println("<>~~~~~~~~~~<>~~~~~~~~~~~~~~<>~~~~~~~~~~~~<>");
	for (int i = 0; i < vals.size(); i++) {
		if (vals.get(i).equalsIgnoreCase("Media")) {
			System.out.println(vals.get(i - 2));
			}
		}
	}
    public static void main(String[] args) {  
      try {
    	  //need Data.txt to work! with identities
	  File fin = new File("Data.txt");
	  Scanner scan = new Scanner(fin);
	  ArrayList<String> theData = new ArrayList<String>();
	      
	  // read the column headings from the flat text file
        String line = scan.nextLine();
  	  while(scan.hasNextLine()){
	    line = scan.nextLine();
	    String[] list = line.split(",");
	    int key = Integer.parseInt(list[0]);
	    String name = list[1];
	    int fee = Integer.parseInt(list[2]);
	    String specialty = list[3];
	        
	    theData.add(String.valueOf(key)); 
	    theData.add(name);
	    theData.add(String.valueOf(fee)); 
	    theData.add(specialty);
	   }
	   int count = 1;
       for (int i = 0; i < theData.size(); i++) {
    	   System.out.print(theData.get(i) + "\t\t");
    	if(count % 4 == 0 )
    		System.out.println(" ");
     		count++;
      }
      excessFeeConsultants(theData);
      showMediaServicesConsultant(theData);
      System.out.println("<>~~~~~~~~~~<>~~~~~~~~~~~~~~<>~~~~~~~~~~~~<>");
      searchData(theData);
      scan.close();
      } catch (FileNotFoundException e) {
      e.printStackTrace();
      	}
    }
}