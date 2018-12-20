import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// Programmer: James Dumitru :)
public class TaskManagement {
    public static void main(String[] args) {        
	try 
	{
	  Scanner scan = new Scanner(System.in);

	  // define the tasks
	  ArrayList<String> theTasks = new ArrayList<String>
	  (Arrays.asList("Task 1", "Task 2", "Task 3", "Task 4", "Task 5"));
	      
	  // define the task durations
	  ArrayList<Integer> theDurations = new ArrayList<Integer>
	  (Arrays.asList(20, 25, 18, 9, 13));
	      
	  // define the task status
	  ArrayList<String> theStatus = new ArrayList<String>
	  (Arrays.asList("Open", "Open", "Open", "Open", "Open"));
	      
	  // define the current task
	  int num = 0;
	   
	  // define the processors
	  int processor1 = 0;
	  // int processor2 = 0; --don't really need--
	     
	  // define the total running time
	  int TRT = 0;
      
	  // display initial data
	  listTasks(theTasks);
	  listDurations(theDurations);
	  listStatus(theStatus);      
	      
	  // commence the processing
	  // assign the duration of Task 1 to processor 1
	  // change the status of Task 1
	  // update the total running time of the complete process

	// Start for loop 
      for (int j = 0; j < 5; j++){
	  num += 1;
	  processor1 += theDurations.get(j);
	  theStatus.set (j, "In Use"); 
	  TRT += theDurations.get(j);
      
	  // show current process 
	  showProgress(num, processor1, theStatus.get(j), TRT);
	      
	  // display current data
	  listTasks(theTasks);
	  listDurations(theDurations);
	  listStatus(theStatus);
	  theStatus.set(j, "Closed");
      }
      System.out.println(" ");
      //display final status
      System.out.println(
      "The final status of processes after the completion of all the tasks are as follows: ");
      System.out.println(" ");
      // brings out functions 
      listTasks(theTasks);
      listDurations(theDurations);
      listStatus(theStatus);
      System.out.println(" ");
      // Display total time.
      System.out.println(
      "The Total execution time of processors are: "+ TRT);
	  // continue the task processing   
        scan.close();
	}
	catch (Exception e) {         
	  e.getMessage();
	}
    }
    public static void listTasks(ArrayList<String> tasks){
    	System.out.println(" ");
    	for (int i = 0; i < tasks.size(); i++) {
 	  System.out.print(tasks.get(i) + "\t");
  	}
    	System.out.println(" ");
    }
    public static void  listDurations(ArrayList<Integer> durations){
    	System.out.println(" ");
    	for (int i = 0; i < durations.size(); i++) {
 	  System.out.print(durations.get(i) + "\t"); 			
  	}
    	System.out.println(" ");
    }
    public static void listStatus(ArrayList<String> status){
    	System.out.println(" ");
    	for (int i = 0; i < status.size(); i++){
 	  System.out.print(status.get(i) + "\t");
   	}
    	System.out.println(" ");
    }
    public static void showProgress(int n, int processor, String s, int total){
    	System.out.println(" ");
    	System.out.println("Task Number" + "\t" + n );
    	System.out.println("task time" + "\t" + processor );
    	System.out.println("task status" + "\t" + s );
    	System.out.println("total time" + "\t" + total );
    	System.out.println(" ");
    }
}
