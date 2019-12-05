package day32_JavaReview;

public class OverloadMethodReview {
	/*
	 overload methods: improves the reusability
	 				improves readability
	 				flexible during runtime
	 				
	 		same method names, different parameters
	 		
	 		return type of the overload does not matter
	 
	 */
	public static void main(String[] args) {
		
		sum(10,20,5);
		sum(10.5,10.4);
		sum(3, 6L, 10>9);
	int total =	sum(3, 5.5, (byte)9);
	System.out.println("sum is: "+total);
	}
	
	
	
	public static void sum(int a, int b) {
		System.out.println("sum is: "+ (a+b));
	}
	
	public static void sum(double a, double b) {
		System.out.println("sum is: "+ (a+b));
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println("sum is: "+ (a+b+c));
	}
	
	public static void sum(double a, long b, boolean c) {
		System.out.println("You have entered: "+ a +" "+ " " +b+" "+c);
	}
	
	
	
	public static int sum(int a, double b, byte c) {
		
		int sum = a+ (int)b +c;
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
