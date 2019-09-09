package day10_Ifstatement;

public class Multi_Branch_IfStatement {
 
	/*
      if-else- if-else:
       if(condition1) {
          //A ==> if condition1 is true
        }
        else if (condition2){
          //B ==> if condition1 = false and condition2 = true
        } 
        else {
          //C ==> if condition1 and condition2 are both false
        }
 
    */
	
	public static void main(String[] args) {
		
		if (false) {
			System.out.println("if block");
		}
		else if (true) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		 Task_01
		     90 <= grade  <=100    ==> A
		     80 <= grade < 90 ==>B
		     70 <= grade < 80 ==>C
		     60 <= grade < 70 ==>D
		     else             ==>F
		 */
		int grade = 100;
		if (grade >= 90 && grade <= 100) {
			System.out.println("You've made an 'A', Great job!");
		}
		else if (grade < 90 && grade >= 80) {
			System.out.println("You've made a 'B', Good!");
			}
		else if (grade <80 && grade >= 70) {
			System.out.println("You've made a 'C', That's okey!");
		}
		else if (grade <70 && grade >= 60) {
			System.out.println("You've made a 'D', Really?!");
		}
		else {
			System.out.println("You've made a 'F', Study more!");
		}
		
		
		/*
		 Task02:
		 1. write a program that:
		 			a. 0 ~ 12 ==> good morning
		 			b. 12 ~ 15 ==> good afternoon
		 			c. 15 ~23 ==> good night
		 			d. 12 ==> good noon
		 */
		
		int hour = 12;
		if (hour >= 0 && hour < 12) {
			System.out.println("Good morning!");
		}
		else if (hour > 12 && hour <= 15) {
			System.out.println("Good afternoon!");
		}
		else if (hour > 15 && hour <= 23) {
			System.out.println("Good night");
		}	
		else {
			System.out.println("Good noon!");
		}
		
		/*
		 Task:
		 int num1, num2, num3
		 find the bigger num
		 */
		int num1 = 100, num2 = 100, num3 = 50;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the bigger number");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the bigger number");
		}
		else if (num3 > num2 && num3 > num1) {
			System.out.println(num3+" is the bigger number");
		}
		else if (num3 == num2 && num3 > num1) {
			System.out.println(num3+" and "+num2+" are the bigger numbers");
		}
		else if (num3 == num1 && num3>num2) {
			System.out.println(num3+" and "+ num1+" are the bigger numbers");
		}
		else if (num2 == num1 && num2 > num3) {
			System.out.println(num2+ " and "+num1+ " are the bigger numbers");
		}
		else {
			System.out.println("All of them are equal");
		}
		
		
		
		
		
		
		
		
		
	}
}
