package ReplIt;

import java.util.Scanner;

public class Senior_NonSenior_Citizens {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		int seniorCitizens = scan.nextInt(),
				nonSeniorCitizen = scan.nextInt();
				
		System.out.println("What is new citizen's age?");
		int age = scan.nextInt();
		
		if (age >= 65) {
			seniorCitizens++;
			System.out.println("Senior Citizen ");
		}else {
			nonSeniorCitizen++;
			System.out.println("Non-Senior Citizen ");
		}	    
		System.out.println("New seniorCitizens count "+ seniorCitizens);
		System.out.println("New nonSeniorCitizens count "+ nonSeniorCitizen);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
