import java.io.File;

import java.io.FileNotFoundException;

import java.util.ArrayList;

import java.util.Scanner;

// Programmer: Sammy Student

public class Test1

{

     public static void consultantCharge(ArrayList<String> vals) {
         for (int i = 2; i < vals.size(); i = i + 4) //skip 4 sincw we have 4 fields, and startin field is third field, with index 2
             if (Integer.parseInt(vals.get(i)) > 2000)
                 System.out.println(vals.get(i-2)+"\t"+vals.get(i-1)+"\t"+vals.get(i)+"\t"+vals.get(i+1)); //We are printing the detail, if you want, you can return it
     }
   
   
  
   public static void searchData(ArrayList<String> vals)

   {

       System.out.print("enter a name: ");

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

           System.out.println(" data found ");

       else

           System.out.println(" data not found ");

       sc.close();

   }


   public static void main(String[] args)

   {

       try

       {

           File fin = new File("Data.txt");

           Scanner scan = new Scanner(fin);

           ArrayList<String> theData = new ArrayList<String>();

           // read the column headings from the flat text file

           String line = scan.nextLine();

           while(scan.hasNextLine())

           {

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

           for (int i = 0; i < theData.size(); i++)

           {

               System.out.print(theData.get(i) + "\t\t");

               if(count % 4 == 0 )

                   System.out.println(" ");

               count++;

           }

           scan.close();

           System.out.println(theData);

           searchData(theData);

       }

       catch (FileNotFoundException e)

       {

           e.printStackTrace();

       }

   }

int countMS(){
         int count = 0;
       try

       {

           File fin = new File("Data.txt");

           Scanner scan = new Scanner(fin);

           ArrayList<String> theData = new ArrayList<String>();

           // read the column headings from the flat text file

           String line = scan.nextLine();

           while(scan.hasNextLine())

           {

               line = scan.nextLine();

               String[] list = line.split(",");

               String specialty = list[3];

               if (specialty.equalsIgnoreCase("media services"))
                   count++;
           }

           scan.close();
       }

       catch (FileNotFoundException e)

       {

           e.printStackTrace();

       }
       return count;
   }

}