package day20_JavaRecap;

import java.util.Scanner;

public class MaxAndMinForLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 int     max= -2_147_483_647, 
	                sum = 0,
	                min = 2_147_483_647, 
	                input;
		        for(int i=0;i<5;i++){
	            System.out.println("Enter a number");
	            input = scan.nextInt();
	            sum+=input;
	            if(input >=max){
	                max = input;
	            }
	            if(input<=min){
	                min = input;
	            }
	        }
	        System.out.println("The sum of your numbers are = " + sum);
	        System.out.println("The maximum number you entered is: " + max);
	        System.out.println("The minimum number you entered is " + min);
	}
}

