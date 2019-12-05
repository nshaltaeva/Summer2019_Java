package day48_MethodOverriding;

class student{
	public void printName() {
		System.out.println("Hakan");
	}
}

public class MethodOverRiding extends student{
	
	
	
	public void print(String str) {
		
	}
	
	public void print(double a) {
		
	}
	
	public void printName() {
		System.out.println("Shukrat");
	}
	
//	public void print(String str) {	}//overriding cannot happen in the same class 

	public static void main(String[] args) {
		student obj2 = new student();
		obj2.printName(); //Hakan
		
		MethodOverRiding obj = new MethodOverRiding();
		obj.printName();//Shukrat
	}
}
