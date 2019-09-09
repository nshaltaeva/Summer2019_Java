package day07_Unary_ShortHand;

public class UnaryOperators {
	
	/*
	 +: positive
	 -: negative
	 ++: increment - increases the value by 1
	 increment are:
	 		1. pre increment
	 		
	 		2. post increment
	 --: decrement - decreases the value by 1
	 for +&-:
	 +- ===> -
	 -- ===> +
	 ++ ===> +
	 */
	
	public static void main(String[] args) {
		
		int a =10;
		int b = -10;
		
		System.out.println(b);
		
		int c = +b; // +(-10) = -10
		System.out.println(c);
		
		int d = -c; // -(-10) = 10
		
		System.out.println(d);
	
		int f = -(10); //-10
		System.out.println(f);
		
		//increment
		// pre increment: operator is placed before the variable;
		int num1 = 100;
		++num1; // 101
		int num2 = ++num1;
		System.out.println(num1);//num1 = 101
		System.out.println(num2);//num1+1
		
		//post increment: operator is placed after the variable
		int IntNum = 100;
		System.out.println(IntNum++);//100
		System.out.println(IntNum);//101
		
		int IntNum2 = IntNum++; // IntNum2 = 101
		System.out.println(IntNum2);
		
		System.out.println(IntNum);//102
		
		int x = 100;
		int y = x++ -1; //100 - 1 = 99
		System.out.println(y);
		
		//decrement: decreases the value by 1
				// pre decrement: operator is placed before the variable
		
		int z = 100;
		//z--;
		System.out.println(--z);//99
					
				//post decrement: operator after variable
		//it will pass the current value and then decrease by 1
		
		int w = 95;
		System.out.println(w--);//95
		System.out.println(w);
		
		int t = 25;
		System.out.println(++ t);//26
		System.out.println(-- t);//25
		
		int p = 50;//49=>49=>50=>49=>50
		p = --p + p++ + p-- + p++;
		//  pre   post  post  post
		//  49 + 49 + 	50+	  49
		System.out.println(p); //197
		
		short sum1 = 4;
		int r = sum1*4 - sum1--;
		//      4*4 - 4;
		System.out.println(r);
		System.out.println(sum1);
		
		int g = 1;
		g = - g-- +  g++ / - g-- * --g;
		//	  post	post	post	pre
		//	- 1 +  0/      -1   *  - 1
		System.out.println(g);
		
		
		
		
		
		
		
	}

}
