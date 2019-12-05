package day45_Protected_Default;

import day45_Inheritance.protected_vs_default;

public class Test extends protected_vs_default{
	//      sub class       //super
	
	/*
	 invisible inherited objects:
	 
	 protected String name;
	 
	 protected void printHello() {
		System.out.println("Hello");
	}
	 */
	
	
	
	public static void main(String[] args) {
		
		/*
		protected_vs_default obj = new protected_vs_default();
		obj.printHello(); // protected is not visible outside the package
		obj.printHola(); // default is not visible outside the package
		
		System.out.println(obj.name);
		System.out.println(obj.ID);
		
		*/
		
		Test obj = new Test();
		System.out.println(obj.name);
		obj.printHello();
		
//		System.out.println(obj.ID); // only public and protected can be inherited outside the pachage
		
		
		
		
	}

}
