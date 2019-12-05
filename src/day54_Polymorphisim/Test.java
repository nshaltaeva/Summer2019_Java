package day54_Polymorphisim;


abstract class AbstractClass{
	
	//By 
	public static void ByLinkText() {
		System.out.println("Link Text Super");
	}	
	
	public void get() {
		System.out.println("Chrome");
	}
}

public class Test extends AbstractClass{
	
	public static void Test() {
		
	}
	
	
	public static void ByLinkText(int a) {
		System.out.println("Link Text Sub");
	}
	
	public void get() {
		System.out.println("FireFox");
	}
	
	public static void main(String[] args) {
		
	//	AbstractClass obj = new AbstractClass();
		//we cannot create object from abstract class
		
		
		AbstractClass obj2 = new Test();
		obj2.ByLinkText();//the method is not overridden method
		
		obj2.get();
		
		Test obj3 = new Test();
		obj3.ByLinkText(10);
		
	}

}
