package day30_WrapperClass_ArrayList;

public class WrapperClassMethods {
	public static void main(String[] args) {
		//USEFUL METHODS OF WRAPPER CLASS
	//	MAX_VALUE method: return the max value of the primitive
		
		int maximum = Integer.MAX_VALUE;
		System.out.println(maximum); //returns maximum value of int
		
		double MAxDouble = Double.MAX_VALUE;
		System.out.println(MAxDouble);
		
		byte MaxByte = Byte.MAX_VALUE;
		System.out.println(MaxByte);
		
		char MaxChar = Character.MAX_VALUE;
		System.out.println(MaxChar);
		
	//	MIN_VALUE: returns min value of primitives
		
		int minimum  = Integer.MIN_VALUE;
		System.out.println(minimum);
		
		double MinDouble = Double.MIN_VALUE;
		System.out.println(MinDouble);
		
		byte MinByte = Byte.MIN_VALUE;
		System.out.println(MinByte);
		
		char MinChar = Character.MIN_VALUE;
		System.out.println(MinChar);
	
		
	//   parse methods: convert String values to primitives and the value as primitive
		String str = "123";
		
		//pasreInt ("strValue"): takes the String and converts the string to int
		
		Integer num1 = Integer.parseInt("123");//auto-boxing
		
		System.out.println(num1+1);//num1 is number
		
		int num2 = Integer.parseInt("125");
		System.out.println(num2+0);
		
		//parseByte("strValue")
		
		int num3 = Byte.parseByte("19"); //none
		System.out.println(num3+9);
		
		Byte num4 = Byte.parseByte("18"); //auto-boxing
		System.out.println(num4);
		
	//  parseShort("strValue")
		
		byte num = (byte)Short.parseShort("200");
		System.out.println(num);
		
		short num5 = Short.parseShort("200");//none, because Short.parseShort("200") is already primitive
		System.out.println(num5);
		
		Short num6 = Short.parseShort("200");//auto-boxing
		System.out.println(num6);
		
	//  parseLong("strValue")
		
		long num7 = Long.parseLong("1222"); //none
		System.out.println(num7);
		
		
		
	//  parseFloat("strValue")
		
			float num8 = Float.parseFloat("12.5"); //none
			System.out.println(num8);
			
			Float num9 = Float.parseFloat("12.3");//auto-boxing
			System.out.println(num9);
				
		
	// parseDouble("strValue")
			
		float num10 = (int)Double.parseDouble("123.5");//none
		System.out.println(num10);
		
		double num11 = Double.parseDouble("123.5");//none
		System.out.println(num11);
		
		Double num12 = Double.parseDouble("123.5");//auto
		System.out.println(num12);
		
		
	//  parseBoolean("strValue")
		
		boolean A = Boolean.parseBoolean("CybertekBatch12");
		//any String values other than true will return false
		System.out.println(A);
		
		boolean B = Boolean.parseBoolean("TrUe");
		//method ignores the case sensitivity
		System.out.println(B);
		
		boolean C = Boolean.parseBoolean("10>9"); //none
		// string "10>9" != to String "true"
		System.out.println(C);
		
		Boolean D = Boolean.parseBoolean("TrUe"); //auto-boxing
		System.out.println(D);
		
		
		//==========================================
		int a=10;
		double b=a;
		
	//	Double c =a;//Double wrapper class is only Dedicated to double primitive
		
		int A1 = Byte.parseByte("19");
		Integer A2 = (int)Byte.parseByte("19");
		
		Short A3 = (short)Double.parseDouble("18");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
