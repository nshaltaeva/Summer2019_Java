package day24_JavaRecap;

public class Quiz {
	public static void main(String[] args) {
		
		
	//q2
		int i=5;
		do {
			i--;
		System.out.print(i+" "); //i(1) = 4, i(2)=3 ...
		
	//	++i; //with this iterator is infinite loop
		}while(i>0);
		System.out.println();
	//q3
		int x;
		int y =5;
		for(x=0; x <y; x++) {
			System.out.print( (x+=2) +" ");
			//first if condition executed (x = 0+2)
			// after iterator x++ becomes 3
		}
		System.out.println();
		//q4
		int[] arr = {1,2,3,4,5};
		 for(int i1=1; i1<arr.length; i1++) {
			 System.out.println(arr[i]);
			 break;
		 }
		
		
		System.out.println();
		int X=10;//10+0 = 10+1 = 11+
		for(int j=0; j<=5; j++) {//j: 0 1 2 3 4 5
			X += j;
		}
		System.out.println(X);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
