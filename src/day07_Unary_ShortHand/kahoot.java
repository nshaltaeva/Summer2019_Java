package day07_Unary_ShortHand;

public class kahoot {
	
	public static void main(String[] args) {
	
		//1.
		int a = 30;
		//int b = (long) a;
		int b = (byte) a;
		System.out.println(b);
		
		//3.
		System.out.print("Result A"+ 0+1);
		System.out.print("; Result B 12"+ (1)+(2));
		
		System.out.println("==========================");
		System.out.println("5+2= " +3+4);
		System.out.println("5+2= " +(3+4));
		
		float FloatNum = 100.985665f;
	//  short ShortNum =FloatNum; //float is larger then short
		short ShortNum = (byte) FloatNum; 
		System.out.println(ShortNum);
		
		//7.
		System.out.println((3+2)*2/3%2);
		//					5 *2 / 3%2 first come first serve
		//					10 / 3%2
		//					3%2 ==> 3/2 = 1 ==> (3-2*1)=1
		// 					1
		
		//9.
		long Lnum = 3_000L;
		double Dnum = (float) Lnum; //narrowing
		int Inum = (short) Dnum;
		System.out.println(Inum%1000);
		
		//10.
		double result1 = 10/3;
		//				3; ==> 3.0
		System.out.println(result1);
		double result2 = 10.0/3;
		System.out.println(result2);
		
		//13.
		int a1=10, b1 = 20, c1 = 30;
		
		a1 = a1%5;//10%5 = 0
		b1 = b1%5;//20%5 = 0
		c1 = a1*b1;//0
		
		System.out.println(a1+ "\t" + b1 +"\t"+ c1);
		
		System.out.println("=================");
		System.out.println(10/3L);
		System.out.println(10/3f);
		System.out.println(10/3d);
		
		System.out.println(10.5%3);
		
		
		
		
	}

}
