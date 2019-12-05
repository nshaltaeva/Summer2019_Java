package day35_Constructor;

public class ConstructorMethod {

	public ConstructorMethod(int a) {
		System.out.println("Constructor with argument " + a);
	}
	 public ConstructorMethod(boolean a) {
	//	ConstructorMethod(9); //constructor cannot be called by ConstructorName
		 this(9);
		 System.out.println("Constructor with argument of: "+a);
	 }
	
	public static void main(String[] args) {
	//	ConstructorMethod obj = new ConstructorMethod("Hello");
								// the constructor is not exist
	//	ConstructorMethod obj = new ConstructorMethod();
		// the constructor is not exist
	
		ConstructorMethod obj = new ConstructorMethod(9); //existing constructor
		System.out.println("==================================");
		ConstructorMethod obj2 = new ConstructorMethod(true);	
		method1();
	}
	
	
	public static void method1() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
