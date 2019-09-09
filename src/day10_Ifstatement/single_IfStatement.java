package day10_Ifstatement;

public class single_IfStatement {
	
	public static void main(String[] args) {
		
		/*
		 singe if:
		 	if (boolean expression) {
		 	    //A
		 	}
		 */
		if (9>8) {
			System.out.println("9 is greater than 8");
		}
		
		if (9<8) {
			//false
			System.out.println("8 is greater than 9");			
		}
		
		System.out.println("Test completed"); // it does not belong to if statement
		
		//Task01:
		int num1 = 100;
		int num2 = 300;
		int max =0;//local variable need to be initialized before use
		
		if (num1 > num2) { //means that num1 is greater that num2
		//	max = num1;
			max += num1;
				
		}
		if (num1<num2) {
		//	max = num2;
			max += num2;
		}
		System.out.println("Maximum number is " +max);
	//	System.out.println("Maximum number between " +num1 " and " +num2+ " is " + max);
		
		//Task02:
		
		int hours = 12;
		int minutes = 45;
		int seconds = 33;
		
		String amOrpm = "pm";
		
		
		System.out.println(hours+ ":"+minutes+":"+seconds+" "+amOrpm);
		
		//Task03
		//solution1
		int n1 = 10000, n2 = 50000, n3 = 7000;
		int max1 = 0;
		
		//in order to n1 = be the maximum : n1 > n2 && n1 > n3
		//in order to n2 = be the maximum : n2>n1 && n2 > n3
		//in order to n3 = be the maximum : n3>n1 && n3>n1
		
		if (n1 > n2 && n1 > n3) {
			max1 = n1;
		}
		if (n2>n1 && n2 > n3) {
			max1 = n2;
		}
		if (n3>n1 && n3>n1) {
			max1 = n3;
		}
		
		System.out.println("Maximum number between " +n1 +", " + n2+ " and " +n3+ " is "+max1);
		
		//solution2:
		if (n1>n2 && n1>n3) {
			System.out.println("Max num is "+n1);
		}
		if (n2>n1 && n2>n3) {
			System.out.println("Max num is "+n2);
		}
		if (n3>n1 && n3>n2) {
			System.out.println("Max num is "+n3);
		}
		
		//Task04:
		
		int statusCode = 2005;
		String finalRes = "Invalid Status code";
		if (statusCode == 200) {
			finalRes = "OK";
		}
		if (statusCode == 201) {
			finalRes = "Created";
		}
		if (statusCode == 404) {
			finalRes = "Not found";
		}
		System.out.println("Status code " +statusCode+ " is: " + finalRes);	
 		
		//Task05:
		int number  = 900-8000;
		String str = "zero";
		/*
		 number to be positive: number >0, 
		 number to be negative: number <0
		 number to be zero: number == 0
		 */
		
		if (number > 0 ) {
			str = "positive";
			//System.out.println(number + " is " + str);
		}
		if (number < 0) {
			str = "negative";
		//	System.out.println(number + " is " + str);
		}
		
		System.out.println(number + " is " + str);
		
		//solution2
		int number2 = 5000;
		if (number2>0) {
			System.out.println("Positive");
		}
		if (number2 < 0 ) {
			System.out.println("Negative");
		}
		if (number2 == 0) {
			System.out.println("Zero");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
