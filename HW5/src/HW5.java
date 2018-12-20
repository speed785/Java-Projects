	import java.util.Scanner;
	public class HW5 {
		public static void main(String[] args)
		{
			Scanner gpa = new Scanner(System.in);
			//variables
			float gradeAverage = 0;
			int studentStatus = 0;
			//Question of status
			System.out.println("Enter student's status (1-for full time, 0-part time): ");
			studentStatus = gpa.nextInt();
			System.out.println("Enter grade point aveage (GPA)");
			gradeAverage = gpa.nextFloat();
			//Output of placement depending on Status
			//full-time + of at least 3.50 GPA is needed for placement on the Dean's list
			if(studentStatus == 1){
			if(gradeAverage >= 3.5){
			// put the student in Dean's list
			System.out.println("You can be placed in the Dean's list");
			}else{
			System.out.println("You can not be placed in the Dean's list");
			}
			}else{
			      System.out.println("You can not be in the Dean's list");
		}
	}
}