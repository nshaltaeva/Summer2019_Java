package day22_NestedLoop;

public class NestedLoop {
	public static void main(String[] args) {
		/*
		 * for loop inside the for loop
		 12345
		 12345
		 12345
		 12345
		 12345
		 */
		
	for (int z = 0; z < 5; z++)	{
		for(int i = 1; i <=5; i++) {
			System.out.print(i);
		}
		System.out.println();//breaking line
	}	
		
	/*
	 *****
	 *****
	 *****
	 *****
	 *****
	  	
	 */
		
		//String star = "*****";
		
		int x =5;
	while(x >0) {
		int y =1;
		while (y <= 5 ) {
			System.out.print("*");
			y++;
		}
		System.out.println();
		x--;
	}
		System.out.println("\n");
/*
	 *
	 **
	 ***
	 ****
	 *****	
	 ******
	 *******
 */
		
		for ( int c=1; c<=7; c++) {
			for (int j = 1; j <= c; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int A =1;
		while (A <= 7) {
			
			int B = 1;
			while (B <= A) {
				System.out.print("*");
				B++;
			}
			
			System.out.println();
			
			A++;
		}
		
		
		
		
		
		
		
		
		
	}

}
