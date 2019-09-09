package day11_IF_Statement_review;

public class warmup {
	
	public static void main(String[] args) {
		
		/*
		 2. grade calculator
		 A => 90~100
		 B => 80~89
		 C => 70~79
		 D => 60~69
		 F => 0~59
		 */
		
		int grade = 30;
		boolean A = grade >= 90 && grade <= 100;
		boolean B = grade >= 80 && grade < 90; //<=89 also we can use
		boolean C = grade >= 70 && grade < 80;
		boolean D = grade >= 60 && grade < 70;
		boolean ValidGrade = grade >=0 && grade <= 100;
		
	if (ValidGrade)	{
		// in order to multibranch if gets executed, first ValidCrade should be true
		if (A) {
			System.out.println("You've made an A, Great job");
		}
		else if (B) {
			System.out.println("You've made a B, Good");
		}
		else if (C) {
			System.out.println("You've made a C, That's Ok");
		}
		else if (D) {
			System.out.println("You've made a D, Really?!");
		}
		else { //0=< grade <60
			System.out.println("You've made aa F, Study more!");
		}
		
	} else {
		System.out.println("Invalid grade");
		
	}
		
	System.out.println("\n=====next line==========\n");
		/*
		 declare an int variable called Age 
		 declare a boolean variable GoodPerson
		  if goodperson is false
		  age >= 18 => cigar
		  age >= 21 => Hookah
		  age >= 25 => alcohol
		  age < 18 => milk
		  
		  age: 23 
		  else 
		  //bad for your health
		  
		 */
		
		int age =22;
		boolean GoodPerson = true;
		
		if (age>=18) {
			
			if (GoodPerson) {
				System.out.println("Alcohol is bad for your health");
			}
			else { //GoodPerson = false && age >=18
				System.out.println("You can buy Cigaretes");
			
			 if (age >= 21) {
				 System.out.println("You can buy Hookah");
			 }
			if (age >= 25) {
				System.out.println("You can buy Alcohol");
			}
			}
			
		}
		else { //less than 18
			System.out.println("Buy MILK!!!");
		}
		
		System.out.println("\n========next line=======/n");
		
		/*
		 1. write a program that can find the number  of days in a  month
		 
		 int month = 0~12;
		1. Jan - 31
		2.  Feb - 28
		3.  Mar - 31
		4. Apr - 30
		5.  May - 31
		6. Jun - 30
		7. Jul - 31
		8. Aug - 31
		9. Sep - 30
		10. Oct - 31
		11. Nov - 30
		12. Dec - 31
		
		28 days: 2
		30 days: 4,6,9,11
		31 days: 1,3,5,7,8,10,12
		
		even number of 30 days: 4 & 6
		odd number of 30 days: 9 &11
		
		even number of 31 days: 8, 10 & 12
		odd numbers of 31 days: 1, 3, 5 & 7
		 */
		
		int month = 5;
		if (month >0 && month < 13) {
			if ( month == 1) {
				System.out.println("31 days");			
			}
			else if ( month == 2) {
				System.out.println("28 days");			
			}
			else if ( month == 3) {
				System.out.println("31 days");			
			}
			else if ( month == 4) {
				System.out.println("30 days");			
			}
			else if ( month == 5) {
				System.out.println("31 days");			
			}
			else if ( month == 6) {
				System.out.println("30 days");			
			}
			else if ( month == 7) {
				System.out.println("31 days");			
			}
			else if ( month % 2 == 0) {//months greater than 7, if its even ==> 31 days
				System.out.println("31 days");			
			}else {////months greater than 7, if its odd ==> 30 days
				System.out.println("30 days");
			}
				
			
					
		}
		else {
			System.out.println("Invalid Entry");
		}
		System.out.println("\n=====================\n");	
		
		/*
		 
		 28 days: 2
		 30 days: 4,6 9,11
		 31 days: 1,3,5,7,8,10,12
		 
		 leap year: 
		 		29 days: 2
		 */
		int month2 = 13;
		int year = 2000;
		
		if (month2 >0 && month2 <13) {
		if (month2 == 2) {
			if (year%4 == 0) {//condition for leap year
				System.out.println("29 days");
			} else {//condition for regular year
				System.out.println("28 days");
			}
		//	System.out.println("28 days");
		}
		else if (month2 == 4 || month2 == 6) {//month2 =4 or month2 = 6
			System.out.println("30 days");
		} else if (month2 == 9 || month2 == 11) {//month2 =9 or month2 = 11
			System.out.println("30 days");
		}else {//month2 = 1,3,5,7,8,10,12
			System.out.println("31 days");
		}
		}else {
			System.out.println("Invalid Entry");
		}
		
		System.out.println("\n=====================");
	//if-else && else-if
		
		if (true) {//true
			System.out.println("Hello");
		} else {//false
			System.out.println("Batch 12");
		}
	
		if (true) {//true
			System.out.println("Hello");
		} else if (false) {//false
			System.out.println("Batch12");
		} else {//NEVER GETS EXECUTED
			System.out.println("Cybertek");
		}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
