package day22_NestedLoop;

public class practice {
	public static void main(String[] args) {
		
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****	 
				 
		 */
		
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		
	for (int j =1; j <=10; j++) {
		for (int i = 1; i <= j; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
		System.out.println();
	/*
	      ******
	      *****
	      ****
	      ***
	      **
	      *
	 */
	for (int j =7; j >=1; j--) {
		 for (int i=j; i>=1; i--) {
		
			System.out.print("7");
	}
		System.out.println();
	
	}		
		System.out.println();
		
	for (int j =7; j >=1; j--) {
		 for (int i=1; i<=j; i++) {
		
			System.out.print("~");
	}
		System.out.println();
	
	}		
			
		
		
		
		
		
		
		
	}

}
