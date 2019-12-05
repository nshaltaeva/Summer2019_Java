package day21_WhileLoops;

public class do_While {

	public static void main(String[] args) {
		
		boolean A = false;
		while (A) {
			System.out.println("Hello");
		}
		
		do {
			System.out.println("hello");
		} while (A);
		

     /*   int x = 1;
        while(x <= 100) {
            if(x%2==0) {
                System.out.print(x+" ");
            }
            
            x++;
        }
		*/
		
		int x =1;
		do { if(x%2==0) {
            System.out.print(x+" ");
        }
        x++;
			
		}while(x <= 10);
		
		System.out.println();
		
		do {
			System.out.println("hello world");
			break;
		}while(true);
		
		
		int num1 = 5;
		do {
			System.out.println(--num1+" ");
		}while(num1 == 0);
		
		System.out.println("=====");
		int k = 0;
		int l = 7;
		for (k=0; k < l-1; k +=2 ) {
			System.out.println(k+" ");
		}
		
	 System.out.println("====");
	 for(int h=0;h <= 4;) {
		 h++;
		 System.out.println(h+" ");
	 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
