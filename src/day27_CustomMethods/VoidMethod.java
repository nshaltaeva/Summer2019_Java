package day27_CustomMethods;

public class VoidMethod {
    /*
     declaration of method:
     access-modifier specifier return-type methodname(){statements };
     */
	public static void main(String[] args) {
		MyFirstMethod();
//method is a grouping a series of statements to perform specific task
// benefits: reusable, can avoid repeating the same set of statement
		
		
		Even1to100();
	}
	
	public static void Even1to100() {
		 for (int i=0; i <=100; i++) {
			 if(i%2 != 0) {
				 continue;
			 }System.out.print(i+" ");
		 }
	}
	
		
	public static void MyFirstMethod() {
		
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Khurshed");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
