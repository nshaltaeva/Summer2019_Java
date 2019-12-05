package day32_JavaReview;

public class CustomMethods_Review {
	/*
	 Declaration of methods:
	 Access-modifier specifier return-Type MethodName(parameter){
	 			method body
	 }
	 
	 Access modifier: public
	 	specifier: static
	 	return-type: void, all primitives and non primitives
	 	methodName: anyName
	 	parameter: all data type
	 
	 
	 
	 if the return type is void: method does not return any value
	 
	 if the return type is NOT void: the method MUST return a value, 
	 						and the returning value MUST match with return type
	 
	 methods that passes parameter (with argument): method requires extra informations to perform it's task
	 
	 
	 */
	
	//return-type VOID 
public static void main(String[] args) {
	method1();
	EvenNum();
	ReserseStr("Nurzat");
	
	byte num =	(byte)largestNum(12 , 13);  // 13
	System.out.println(num);
	
	String str = Reverse("Hazim");
	System.out.println(str);
}
	
	
	public static void method1() {
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		
	}
	
	public static void EvenNum() {
		for(int i=1; i<=100;i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.print(i+" ");
		}System.out.println();
	}
	
	public static void ReserseStr(String str) {
		for(int 
				i=str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}System.out.println();
	}
	
	
	//NOT VOID return-type
	public static int largestNum(int a, int b) {
		int max = 0;
		 max = (a > b) ? a : b;
		return max;
	}
	
	public static String Reverse(String str) {
		String result ="";
		for(int i=str.length()-1; i>=0;i--) {
		//	result += str.substring(i, i+1);
			result += "" +str.charAt(i);
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
