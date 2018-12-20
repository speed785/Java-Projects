import java.io.*;
//Create a class WriteFile
class WriteFile
 {
    public static void main (String[] args)

    {
//try catch block
      try 
       {
        //create a FileWriter object  to create a file
        FileWriter file = new FileWriter("Frost.txt");
//can also use "Frost.txt"
	 
  //create a BufferedWriter object to write 
  //to the file

   BufferedWriter buffer = new BufferedWriter(file);

  //add statements to write lines of text 
  buffer.write("Stopping by woods on a snowy evening");
	buffer.newLine();
  buffer.write("by Robert Frost");
	buffer.newLine();

  buffer.write("The woods are lovely dark and deep");
	buffer.newLine();
  buffer.write("But I have promises to keep");
	buffer.newLine();
  buffer.write("And miles to go before I sleep");
	buffer.newLine();
  buffer.write("And miles to go before I sleep");
	buffer.newLine();



  //close the BufferedWriter Object
        buffer.close();
       }
      catch (IOException e)
       {
         System.out.println("A write error has occurred");
	  }
    }
 }
