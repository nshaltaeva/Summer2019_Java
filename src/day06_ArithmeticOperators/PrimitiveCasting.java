package day06_ArithmeticOperators;

public class PrimitiveCasting {
	
	/*
	 casting: converting larger primitive to smaller size
	 	 datatype variablename = (datatype) value
	 	 
	 	 casting: explicit & implicit
	 	 
	 	 
	 primitives: byte, short, int, long, float, double

	 */
	
	public static void main(String[] args) {

//explicit casting
		int a = 10;
		byte b = (byte) a; //explicit casting
		System.out.println(b);
		
		double DecimalNumber = 10.5;
	float FloatNumber = (float) DecimalNumber; //double>float
	float FloatNumber1 = (int) DecimalNumber;//FloatNumber = 10;
		System.out.println(FloatNumber);
		System.out.println(FloatNumber1);
		
		long LongNum = 300L;
			int IntNum = (int)LongNum;
			int IntNum2 = (short)LongNum;
			int IntNum3 = (byte)LongNum;//byte<300
			
			System.out.println(IntNum);
			System.out.println(IntNum2);
			System.out.println(IntNum3);
			
//implicit casting
			byte ByteNum = 100;
			int IntNum4 = ByteNum;
			//same with
			int IntNum5 = (int) ByteNum;
			
			System.out.println(IntNum4);
			
			short ShortNum = 100;
			long LongNum2 = ShortNum;
			//same with
			long LongNum3 = (long)ShortNum;
			
			// explicit casting practices;
			double LargestNum = 100.8765;
			
			byte ByteValue = (byte) LargestNum;
			
			System.out.println(ByteValue);
			
			float FloatValue = (short) LargestNum; //100
			float FloatValue1 = (int) LargestNum; //100
			float FloatValue2 = (long) LargestNum; //100
			float FloatValue3 = (float) LargestNum; //100.0
			System.out.println(FloatValue);//100.0
			System.out.println(FloatValue1);//100.0
			System.out.println(FloatValue2);//100.0
			System.out.println(FloatValue3);//100.8765
			
			float FloatNumber2 = 500.67F;
			
			int myNum = (short)FloatNumber2; //500 //short or int
			System.out.println(myNum);
			
			int Num1 = 100;
			int Num2 = 200;
			int Num3 = 300;
	
			
			int num1 = 100 , num2 = 200, num3 = 300;
			
			System.out.println(num1 + "\t" + num2);
			
			boolean result;
		//	System.out.println(result); local variable must be initialized
			
			char Char1 = 'A';
			System.out.println(Char1);
			
			boolean result1, result2, result3;
			
		//	System.out.println(result1);
			
			
			
			
			
	}

}
