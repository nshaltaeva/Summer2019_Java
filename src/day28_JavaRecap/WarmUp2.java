package day28_JavaRecap;

public class WarmUp2 {
	/*
	  4. write a method that accepts 3 parameters: 2 numbers and one operator, and prints out the calculation 
	 
     if operator is not between [-, +, *, /, %] output should be Invalid Operator
     Ex: calculate(10,2, "*") ==> 20;
     
 	5. write a method that can calculate grade
         if score is 100 ~ 90 ==> A
         if score is 89 ~ 80 ==> B
         if score is 79 ~ 70 ==> C
         if score is 69 ~ 60 ==> D
         if score is 0 ~ 59 ==> F
         otherwise ==> Invalid Score
         */
	public static void main(String[] args) {
		calculate(10, 5, "/");
		CalculateGrades(120);
	}
	
	public static void CalculateGrades(int Score) {
		char grade = (Score >= 90 && Score <= 100)? 'A':
			(Score >= 80 && Score <= 89)? 'B':
				(Score >= 70 && Score <= 79)? 'C':
					(Score >= 60 && Score <= 69)? 'D':
						(Score >= 0 && Score <= 59)? 'F': 'I';
		
		if (grade == 'I') {
			System.out.println("Invalid Score");
		}else {
			System.out.println(grade);
		}		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void calculate (int a, int b, String operator) {
		String result = "";
		if(operator.equals("-")) {
			result +=(a-b);
		}else if (operator.equals("+")) {
			result += (a+b);
		}else if(operator.equals("*")) {
			result += (a*b);
		}else if(operator.equals("/")) {
			result += (a/b);
		}else if(operator.equals("%")) {
			result += (a%b);
		}else {
			result = "invalid";
		}
		System.out.println(result);
		
		
		String result2 ="";
		result2 += (operator.equals("-"))?(a-b):
			(operator.equals("+"))?(a+b):
				(operator.equals("*"))?(a*b):
					(operator.equals("/"))?(a/b):
						(operator.equals("%"))?(a%b):"invalid";
						
		System.out.println(result2);
					
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
