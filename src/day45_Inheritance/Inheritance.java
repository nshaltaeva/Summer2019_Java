package day45_Inheritance;


class TestBase{
	
	static String chromeDriver;
	
	public static void TakeScreenShot() {
		System.out.println("Took ScreenShot");
	}
	
}

public class Inheritance extends TestBase{
			// sub              // super
	//sub class Inheritance is gonns inherit all the visible or protected features  from the class
		//true || false ==> true
	
	/*
	 * static String chromeDriver; //this is invisible instance variable that extended from super class
	
	 *public static void TakeScreenShot() {
		System.out.println("Took ScreenShot");
	}
	 */
	
	
	
	public static void main(String[] args) {
		
	System.out.println(chromeDriver);	
	
		
		
	}
	
	
	
	
}
