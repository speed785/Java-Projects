import java.util.Random;

public class LoopingTechniques {

   public static void main(String[] args) {
       //1. While() Loops  
       //store the set of values in an array
       int[] values={1,2,3,4,5,6};
       Random rand=new Random();
       //declare and set a counter variable to 1 to control the loop
       int count=1;
       System.out.println("While loop sample:");
       //run a loop from 1 to 5 (5 times)
       while(count<=5)
       {
           //get a random number between 0 and 6 (6 is the number of values in set)
           int idx=rand.nextInt(values.length);
           //use this random number generated as index and print the value from the array
           System.out.println("Iteration-" + count + ": " + values[idx]);
           //increment count
           count++;
       }

       //2. for() loops
       System.out.println("\nfor loop sample:");
       //set counter variable to 0, sentinel value to <=3 and step increment to 2
       for(int counter=0;counter<=3;counter+=2)
       {
           //print text
           System.out.println("Chicago");
       }

       //3. nested looping Techniques
       System.out.println("\nnested loop sample:");
       int i = 20, m = 10, n = 15, p = 30;
       for (i = m; i < n; i += p)
       {
           //set i to m
           m = i;
           //set n to m+p
           n = m + p;
           //set m to n+3*p
           m = n + 3 * p;
           //print m,n,p
           System.out.println("\t" + m + "\t"+ n + "\t" + p);
       }

   }

}