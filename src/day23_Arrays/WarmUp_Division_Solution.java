package day23_Arrays;

import java.util.Scanner;

public class WarmUp_Division_Solution {
	public static void main(String[] args) {
		
		int x =20;
		int y =6;
		int count =0;
		while (x >= y) {
			x -= y;
			count++;
		}
		System.out.println(count);//result after dividing two nums
		System.out.println(20/6);
		System.out.println(x); //remainder
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = 0;
		if(num2 != 0) {
		
		// 10         3
		while (num1 >= num2) {
			num1 -= num2;
			result ++;
		}
		System.out.println("Division is: "+result);
		System.out.println("Remainder is: "+num1);//remainder
		}else {
			System.out.println("Number cannot be divided by zero");
		}
		//divide to negative and if num2 more than num2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
