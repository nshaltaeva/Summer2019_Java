package day20_JavaRecap;

public class WarmUp1 {
	public static void main(String[] args) {
		
		/*
		  1. find the sum of all the numbers between 1 to 1000
    	  2. find the sum of all even numbers between 1 to1000
          3. find the sum of all odd numbers between 1 to 1000
    	  
    	  
		 */
		
		//task01
		int sum1 = 0;
		for(int i = 1; i <= 1000; i++) {// i: 1~1000
			sum1 += i; 			
		}
		System.out.println("sum of all nums: "+sum1);
		
		//task02 - 1 solution
		int sum2 = 0;
		for(int i = 1; i <= 1000; i++) {// i: 1~1000
			if (i%2 == 0) {
				sum2 += i;
			}			
		}
		System.out.println("sum of all even nums: "+sum2);
		
		//task02 - 2nd solution
		
		int Sum2 = 0;
		for (int i = 2; i <= 1000; i += 2) {
			Sum2 += i;
		}
		System.out.println("sum of all even nums: "+Sum2);
		
		//task3 solution 1
		
		int sum3 = 0;
		for(int i = 1; i <= 1000; i++) {// i: 1~1000
			if (i%2 == 1) {
				sum3 += i;
			}			
		}
		System.out.println("sum of all odd nums: "+sum3);
		
		//task3 solution2
		int Sum3 = 0;
		for (int i = 1; i <= 1000; i += 2) {
			Sum3 += i;
			
		}
		System.out.println("sum of all odd nums: "+Sum3);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
