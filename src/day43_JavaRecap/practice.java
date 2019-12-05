package day43_JavaRecap;

public class practice {
	
	public static void main(String[] args) {
		
		staticKeyword.printName();//Nurzat
		//static method can be called through the class name
		
	//	staticKeyword.printName2();//instance method cannot called through the class name
		
		practice.printName();//Semra
		printName();//same with practice.printName();//Semra
		
		staticKeyword obj = new staticKeyword();
		obj.printName2();//in order to call non-static we must create an object
		
		System.out.println(staticKeyword.StaticName);//static features can be called through class name
		
	//	System.out.println(staticKeyword.InstanceName);//Instance variables cannot be called through the class name
		
		
	}
	
	public static void printName() {
		System.out.println("Semra");//still Nurzat
	}

}
