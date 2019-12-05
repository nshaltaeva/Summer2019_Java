 package day33_ArrayList_MethodCalls;

public class MethodCalls {
public static void main(String[] args) {
	
	method3();
	
	int max = max(3,5);
	System.out.println(max);
	
	int max2 = max(3,7,9);
	System.out.println(max2);
	
	maximum(10, 20, 30);
	
	
	String str = print(20,30,40);
	System.out.println(str);
	
	
	
}
	
	public static void method1() {
		System.out.println("A");
	}
	
	public static void method2() {
		method1();//A
		System.out.println("B");//B
	}
	
	
	public static void method3() {
		method2();//A,B
		System.out.println("C");//C
	}
	
	
	
	public static int max(int a, int b) {
		return (a>b)?a:b;
	}
	
	public static int max(int a, int b, int c) {
	//	int largestNum = max(a, b); //calling from another return method
		
		return (max(a,b) > c) ? max(a,b) : c;
	//	return (largestNum>c)?largestNum:c;
		
	}
	
	public static int max(int a, int b, int c, int d) {
		return max (max(a,b),max(c,d));
		
		/*
		 int result = max(a,b,c);
		 if(result>d){
		 return result
		 }
		 result d;
		 */
		
		
	}
	
	public static int max (int a, int b, int c, int d, int e) {
		
		return max(max(a,b,c,d),  e);
	}
	
	
	
	
	
	
	public static void maximum (int a, int b, int c) {
		System.out.println(max(a,b,c));
	}
	
	public static String print(int a, int b, int c) {
		maximum (a,b,c);
		
		return"900";
	}
	
	
	
	
	
}
