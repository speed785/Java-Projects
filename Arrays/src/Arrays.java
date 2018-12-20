public class Arrays {
public static void main(String[] args) {
	float[][] a = new float[][] {{29, 149}, {59, 43},{147,11}};//matrix values
	float[] b = new float[] {8, 4};//8 and 4 mmodify ur cost table
		String[] s = new String[] {"cinema 1", "cinema 2","cinema 3"};
		String[] t = new String[] {"Adults  ", "Children"};
		int i,j;
		System.out.println("\n\n");
		System.out.println("Cinema Complex Attendance");
		System.out.println("\n\n");
		System.out.println(" \t\tAdults\t\t" + "Children");
		System.out.println("\t\t_ _ _ _ _ _\t" + "_ _ _ _ _ _\n");
		//change the limit of matrix,3 elements so length-3( 0,1,2)
		for ( i = 0 ; i <= 2 ; i++ )
		{
			for ( j = 0 ; j <1 ; j++ )
				System.out.println(s[i] + " \t"  + a[i][j] + " \t\t" + a[i][j + 1]);
			}
				System.out.println("\nCinema Complex Admission\n");
				for ( i = 0 ; i <2 ; i++ )
					System.out.println(t[i] + " \t$" + b[i]);
					System.out.println("\n\n");
					System.out.println("Cinema Complex Revenue\n\n");
					for ( i = 0 ; i <= 2 ; i++ )
					{
						for ( j = 0 ; j <1 ; j++ )
							System.out.println(s[i] + " \t$" +
							(a[i][j] * b[j] + a[i][j + 1] * b[j + 1]));
		}
	}
}