package day06_ArithmeticOperators;

public class ArithmeticOperators {
	
	/*
	 +: addition, adds two number together
	 -: Subtraction, subtracts a number from another one
	 *: multiplication, multiplies
	 /: devision, divides
	 */
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = a-400; //-300
		
		System.out.println(b);
		
		int c = a+b; //100+ (-300) = -200
		System.out.println(c);
		
		int x=3, y=5, z = x*y;
		System.out.println(z);//15
		
		int length = 100, wedth = 10, area = length/wedth;
		System.out.println(area);
		
		System.out.println(3+5+4-2);//10
		
	//	double resultNum = 9/0; /denominator cannot be zero
	//	System.out.println(resultNum);
		
		double Number1 = 10/3f; //system always assign like int number thats why to get decimal should to add letter f
		double Number2 = 10/3.0;// 3.333
		System.out.println(Number2);
		
		
		int output = 12+6/3;
		//12+2=14
		
		System.out.println(output);
		
		System.out.println(5+2*4);//13
		System.out.println(10/2-3);//2
		System.out.println(8+12*2);//32
		
//%: returns the reminder
		/*
		 10/3 ==> 3 with reminder of 1
		 12/5 ==> 2 with reminder : 12 - 5*2 = 2
		 20/3 ==> 
		 
		 */
		
		
		/*
		 20,45,65,67,68
		 
		 even: can be didived by 2 without a reminder
		 odd: diveded by 2 will have a reminder
		 */
		 int Num20 = 20%2; //even
		 int Num45 = 45%2; //odd
		 int Num65 = 65%2; //odd 65-(65/2) *2 = 1
		 
		 System.out.println(Num20);
		 System.out.println(Num45);
		 System.out.println(Num65);
		 
		 System.out.println(4+17%2-1); //4+1-1=4
		 
		 System.out.println(6*3/2);//which comes first we do first(* than /)
		 //highest procedure ( ), %, /, *, -, +
		 
		 System.out.println(1+2-2+3);//4
		 System.out.println(1+2-(2+3));//-2
		 
		 System.out.println(3+4*4+5*(4+3));
		 
		 //% 10/4 ==> 2 with reminder of (10 - 2*4) = 2
		 
		 System.out.println(10%4);
		 
		 System.out.println((4+17)%2-1);
		 // 21 % 2 - 1
		 // 1 -1 =0
		 
		 
		 
		 
		
	}

}
