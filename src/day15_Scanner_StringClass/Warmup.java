package day15_Scanner_StringClass;

public class Warmup {
	/*
	 write a program that can convert numbers (between 0~9) to words.
if the number is greater than 9, the out put should be "invalid number.
	 */
	
	public static void main(String[] args) {
		
		int num = 8;
		String result="";
	//solution 1 with if statement	
		if (num>=0 && num <=9) {
			if (num == 9)
				result = "nine";
			else if (num == 8)
				result = "eight";
			else if (num == 7)
			    result ="seven";
			else if (num == 6)
			    result ="six";
			else if (num == 5)
			    result ="five";
			else if (num == 4)
			    result ="four";
			else if (num == 3)
			    result ="three";
			else if (num == 2)
			    result ="two";
			else if (num == 1)
			    result ="one";
			else 
				result = "zero";
			
		}else {
			result = "Invalid";
		}
		System.out.println(result);	
			
		System.out.println("============");	
			
		//solution 2 with ternary
		// in ternary ? and : should be equal
		
		int n=7;
		String result2 = (n == 9) ? "nine" 
				: (n == 8) ? "eight"
				: (n == 7) ? "seven"
				: (n == 6) ? "six"
				: (n == 5) ? "five"
				: (n == 4) ? "four"
				: (n == 3) ? "three"
				: (n == 2) ? "two"
				: (n == 1) ? "one"
				: (n == 0) ? "zero"
						: "Invalid";
		System.out.println(result2);
														
						
			
			
			
			
			
			
			
			
			
			
			
	}

}
