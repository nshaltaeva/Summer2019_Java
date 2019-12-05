package day40_staticKeyword;

public class staticVariables {
	
	
	static String name;
	
	static double staticNum;
	
	int num1;
	
	public static void main(String[] args) {
		
//		System.out.println(num1); // static method only accepts class members
		staticVariables objA = new staticVariables();
		System.out.println(objA.num1);
		
		
		
		
		
		staticVariables obj1 = new staticVariables();
		obj1.name = "Omer";
		System.out.println(obj1.name);//Omer
		
		staticVariables obj2 = new staticVariables();
		obj2.name = "Khurshed";
		System.out.println(obj2.name); //final value, Khurshed
		
		System.out.println(obj1.name); //Khurshed
		System.out.println("========================================");
		
		System.out.println(staticVariables.staticNum); //0.0
		
		staticVariables object1 = new staticVariables();
		object1.staticNum=4.5;
		System.out.println(object1.staticNum);//4.5
		
		staticVariables object2 = new staticVariables();
		System.out.println(object2.staticNum);//4.5
		
		
		
		staticKeyword.printHello();
		
	}

}
