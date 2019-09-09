package day08_ShortHandOperators;

public class ShortHand {
	
	public static void main(String[] args) {
		/*
		 +=: addition assignment       x+=y =>x=x+y
		 -=: subtraction assignment    x=x-y
		 *=: multiplication assignment x=x*y
		 /=: division assignment 	   x=x/y
		 %=: remainder assignment      x=x%y
		 */
		
		int a = 9;
			//a = a+3;//12
			
			a+=3; //a=a+3;
		System.out.println(a); //12 
		
		int b = a += 5; //12+=5 ==>12+5=17
		System.out.println(b);//17
		// a = 17; b = 17
		System.out.println(a);
		
		int c =  a += b; //a=34, c = 34, b=17
		//		17 += 17
		System.out.println(c);
		
		int d = a += c; //a=68, d=68, c=34, b=17
		//      34 +34
		System.out.println(d);
		
		int e = (d+=b) *2; 
		//      (68 + 17) *2 = 85*2 =170
		System.out.println(e); // d= 85, b=17, c= 34, e = 170
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int f = b += d*2;
		//      b+= 170
		//      17+170=187
		System.out.println(f); //b=187
		System.out.println(b);
		System.out.println(d);
		
	//-=:
		
		int g = 101;
		int h= g -= 1;  //g = 100, h=100
		      //101 -= ==>100
		System.out.println(h);
		
		int i = g+=h+5; //g=205; i=205; h = 100;
		//     100 += 100 + 5 ==> 205
		System.out.println(i);
		
		int j = h+=g%i; //h =100, j =100
		//     100 += 205 % 205
		//     100 += 0 ==> 100
		System.out.println(j);
		
		int k = j-= h *2%5; //j=100, 
		//      j-=      200%5
		//      100 -= 0
		System.out.println(k);
		System.out.println(j);
		System.out.println(h);
		
	// *=:	
		int A = 100;
		A *= 200; //A=A*200
		System.out.println(A); //20000
		
		int B = 100;
		B *= 100/10; //come first (*) - serve first (*)
		System.out.println(B);
		
		B *= B -= 1000;
		//B *= (1000-1000) =0
		System.out.println(B);
		
	//  /=:
		
		int C = 1000;
		C /= 5;
		System.out.println(C);
		
		int D = 10;
		
	//	C /= D -10; denominator cannot be 0
				
		System.out.println(C); //200
		
	 C /= D+10;//C/20 ==> 200/20 ==>10
	 System.out.println(C);
		
	// %=:
	 
	 int Z = 10%3; // ==> 10/3 = 3. ... remainder: 10 - 3*3 = 1
	 
	 int E = 10;
	 E %= 2; //E=10%2
	 System.out.println(E);
	 
	 int F = 100;
	 	 F %= 2; // F=F%2 ==> 0 
	 	 System.out.println(F);//if its zero it means even number
	 	 
	 /*
	  remainder cannot be negative:
	  when we divide a number there will be eigher remainder or no remainder
	  
	  */
	 	 
	 	 System.out.println(-100%3);
	 	 System.out.println(10.5%3);
	 	 //              10.5/3 = 3 remainder: 10.5 -3*3 = 1.5
	 	 
	 	 int J = 300;
	 	 int K = 10;
	 	 
	 	 J += J %= K;
	 	 // J += 0 = 300;
	 	 
	 	 System.out.println(J);
	 	 
	 	 
	 	int num = 198;
		System.out.println(num%=2);
		
		byte ByteNum = 30;
	//	int INum = INum += ByteNum; // we must give value to local variables
		
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
		
		
		
		
		
		
		
		
	}

}
