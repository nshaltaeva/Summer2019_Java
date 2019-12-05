package day27_CustomMethods;

public class VoidMethod_WithArgument {
/*
 methods with argument:
 access-modifier specifier return-type name(parameter){}
 
 parameters: can be any data-type
 */
	public static void main(String[] args) {
		OddOrEven(6);
		//method was designed to take an argument.
		//the method needs the argument in order to perform its task
		OddOrEven(9);
		
		int z=100;
		OddOrEven(z);
		
		int d = 100, f = 34;
		SumOf2Nums(d, f);
		
		
		
		
		
		
	}
	
	public static void OddOrEven(int a) {
		if(a%2 == 0) {
			System.out.println(a+ " even");
		}else {
			System.out.println(a+ " odd");
		}
	}
	
	public static void SumOf2Nums(int a, int b) {
		System.out.println("Sum of numbers "+(a+b));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
