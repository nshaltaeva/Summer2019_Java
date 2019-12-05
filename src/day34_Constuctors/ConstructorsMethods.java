package day34_Constuctors;

public class ConstructorsMethods {
	
	public ConstructorsMethods() {
		System.out.println("I am a Default Constuctor");
	}
	
	public ConstructorsMethods(int num) {
		System.out.println("Hello world");
		System.out.println("I am a constuctor with an argument of int: "+num);
	}
	
public static void main(String[] args) {
	
	ConstructorsMethods obj = new ConstructorsMethods();	
	ConstructorsMethods obj1 = new ConstructorsMethods(4);
	
	method1();
	
}


public static void method1() {
	ConstructorsMethods obj1 = new ConstructorsMethods(4);
}
}
