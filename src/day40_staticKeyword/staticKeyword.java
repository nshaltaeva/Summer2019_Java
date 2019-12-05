package day40_staticKeyword;

import java.util.Scanner;

public class staticKeyword {
	
	int a; //instance variable
	
	static int b = 300; //static variable
	
	static Scanner scan = new Scanner(System.in);
	
	 public static void main(String[] args) {
		 
		 int a = scan.nextInt();
		 
		 
		staticKeyword obj1 = new staticKeyword();
		obj1.a = 100;
		 staticKeyword obj2 = new staticKeyword();
		 obj2.a = 200;
		 
		 System.out.println(obj1.a); // 100
		 //each object has its own copy of instance variables
		 
		 System.out.println(obj2.a); //200
		 
		 double num = 100.5; //local variable only visible within the method
		 
		 System.out.println(staticKeyword.b);
		 System.out.println(obj1.b);
		 System.out.println(obj2.b);
		 
		 System.out.println("=====================");
		 
		 staticKeyword obj3 = new staticKeyword();
		 obj3.a = 100;
		 System.out.println(obj3.a);//100
		 
		 staticKeyword obj4 = new staticKeyword();
		 System.out.println(obj4.a);
		 
		 System.out.println("=================");
		 
		 obj3.b = 400;
		 System.out.println(obj3.b);//400
		 
		 System.out.println(obj4.b);
		 
		 
		 
		 
		 
		 
		 
		 
	}

	 public static void method1() {
		 int a = scan.nextInt();
		 
	//	 System.out.println(num);//local variable only visible within the method
	 }
	 
	 public static void printHello() {
		 System.out.println("Hello Cybertek");
		 int a = scan.nextInt();
	 }
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
