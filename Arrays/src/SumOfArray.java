
class SumOfArray{
public static void main(String args[]){
int array[] = new int [75];
int sum = 0;
for(int i = 0 ; i< 75;i++)
	array[i] = i+1;
	System.out.println("array elements :");

	for( int num : array) {
		sum = sum+num;

		System.out.println(num);
		}

		System.out.println("\nSum of array elements is:"+sum);
   }
}