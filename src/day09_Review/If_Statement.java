package day09_Review;

public class If_Statement {
	
	public static void main(String[] args) {
		
		/*
		 if statement:
		 
		        single if statement:
		              
		        if (boolean expression){
		             // some codes to run
		         }
		         
		         if block only gets executed if the condition is true
		 */
		
		if (true ) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
				}
		
		int a = 1000; //1001
		if (a++ == 1001) {
			// 1000 == 1001 ==> false
			a=2000;
			System.out.println("a is increased");
		}
		System.out.println(a+"\n\n\n");
		
		
		int x = 987654320;
		if (x%2 == 0) {
			System.out.println(x);
			System.out.println("it's an even number");
		}
		
		if (x%2 != 0) {
			//false
			System.out.println(x);
			System.out.println("it's an odd number");
		}
		System.out.println("\n\n\n");
		
		int y = 2345678;
		if (y%5 == 0) {
			// 
			System.out.println(y + " can be divided by 5\n\n");
		}
		if (y%5 != 0) {
			System.out.println(y + " can't be divided by 5\n\n");
		}
		
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		System.out.println(CEO == Kuzzat);//true
		
		if (Kuzzat == CEO) {
			//true
			System.out.println("Great Person in the World");
			System.out.println("First if block");
		}
		
		if (Kuzzat != CEO) {
			//false
			System.out.println("Great person in the World");
			System.out.println("Second if block");
		}
		
		int TotalNum = 100;
		boolean Cybertek = true;
		boolean BestSchool = true;
		
		if (Cybertek == BestSchool) {
			//true
			TotalNum += 500; //600
		}
		if (Cybertek != BestSchool) {
			//false
			TotalNum -= 50;
		}
		System.out.println(TotalNum);
		
		/*
		 1. declare a variable and initialize user age
		 2. write a program if the user is eligible to vote for Donald Trump
		 vote age = 18
		 */
		
		byte PersonAge = 18;
		byte VoteAge = 18;
		
		if (PersonAge >= VoteAge) {
			System.out.println("Yes, you are eligible to vote");
			System.out.println("have fun with the wall");
			System.out.println("MAGA");
		}
		if (PersonAge < VoteAge) {
			// if PersonAge <= VoteAge - this is bug
			System.out.println("You are not eligible to vote yet, please grow up");
		}
		
		
		
		
		
	}

}
