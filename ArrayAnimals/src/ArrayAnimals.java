import java.util.Arrays;
public class ArrayAnimals {
   public static void main(String[] args) {
       String arr[]={"Lion", "Tiger","Bear", "Zebra", "Elephant", "Gorilla", "Rhinoceros"};
       	   System.out.println("Array Elements: ");
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
       //Appending new Element
       int index=arr.length;
       arr[index-1]="Hyena";
       //after appending new element
       	   System.out.println("\n\nAfter appending array: ");
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
       //Replacing "Gorilla" with "Chimpanzee"
       for(int i=0;i<arr.length;i++)
       {
       if(arr[i].equals("Gorilla"))
       {
           arr[i]="Chimpanzee";
       	}
       }
       //after replacing
       	   System.out.println("\n\nAfter Replacing array: ");
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
       //Deleting "Zebra"
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i].equals("Zebra"))
           {
               for(int j=i;j<arr.length-1;j++)
               {
                   arr[j]=arr[j+1];
               }
           }
       }
       //Decrementing by 1 after deleting
       int len=arr.length-1;
       //after deleting
       	   System.out.println("\n\nAfter Deleting array: ");
       for(int i=0;i<len;i++)
       {
           System.out.print(arr[i]+" ");
       }
       //Sorting
       Arrays.sort(arr, 0,len);
       //after sorting
       	   System.out.println("\n\nAfter Sorting array: ");
       for(int i=0;i<len;i++)
       {
           System.out.print(arr[i]+" ");
       }      
       //reverse
           System.out.println("\n\nArray in reverse order:");
       for(int i=len-1;i>=0;i--)
       {
           System.out.print(arr[i]+" ");
       }      
   }
}