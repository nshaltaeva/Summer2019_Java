package day29_ReturnMethods;

public class ReturnMethods {
	
	//decleration of method
	
	public static void main(String[] args) {
		name(); //this is a String value
		System.out.println(name()); //return methods are either printed or assigned
		
		String str = name();//assigning method to String value 
		System.out.println(str);
		
		result();
		System.out.println(result());
		
	}
	
	
	public static boolean result() {
		return 8>9;
	}
	
	
	
	
	
	
	
	//if return_type is void:
	
	public static void method1() {
		System.out.println("Hello");
	}
	
	//if the return_type of the method is NOT void:
	public static String name() {
		return "Batch12"; 
	//	System.out.println();//once return statement executed it exits the method immediately 
	}
	
	
	
	
	
}
