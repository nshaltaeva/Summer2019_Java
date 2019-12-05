package day58_ExceptionContinue;

public class Exception_Review {

	public static void main(String[] args) {
		
		try { //gets executed when code is checked
			System.out.println(9/0);
			System.out.println("try block");
		}catch (RuntimeException e){//gets executed when code is unchecked
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
		
		System.out.println("==========================");
		
		try {
			Thread.sleep(2000);
			System.out.println("Try block");
		}catch(Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
		
		
		
		
		
		
		
	}
}
