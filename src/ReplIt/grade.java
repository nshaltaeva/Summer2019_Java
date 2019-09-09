package ReplIt;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);	
		 
		System.out.println("Enter grade:");
		 int grade = s.nextInt();
		 
		if (grade > 90)
			System.out.println("exellent");
		
		if (grade > 70 && grade < 90)
			System.out.println("good");
		
		if(grade > 60 && grade < 70)
			System.out.println("pass");
		if (grade < 60)
			System.out.println("fail");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
