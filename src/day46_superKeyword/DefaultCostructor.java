package day46_superKeyword;

class B {
	
	/*
	public B() {
		System.out.println("Super");
	}
	*/
	public B(int a) {
		System.out.println("Super1");
	}
	
}

public class DefaultCostructor extends B{
	//           sub             super
	/*
 public DefaultCostructor() {
	 //super(); by default will be called "super"
	 System.out.println("Sub");
	 
 }
 */
 
 public DefaultCostructor(int a) {
	 super(10); //by default will be called "super"
	 System.out.println("Sub");
	 
 }
 	 public static void main(String[] args) {
		
 		 DefaultCostructor obj = new DefaultCostructor(10);
 		 
	}
 
 
}
