package day03_Variables;

public class PrimitiveDataTypes {
/*
 *byte: we can assign whole numbers.  Must be witn in range -128 <= byte <= 127
 *
 short: we can only assign whole numbers. -32768 <= short <= 32767
 
 int:(used most often) we can only assign whole numbers. -2147483648 <= int <= 2147483647
 
 long: we can only assign whole numbers. -9223372036854775808 <= long <= 9223372036854775807
 		(at the end of value we can give l or L)
 		
 		byte < short < int < long 		
 		small one can be assingned to larger one
 		
 		the variables DataType must be larger in order to contain another dataType
 		
 		float: we can assign decimal.(Decimals must have F or f at the end)
 		double(used more often): we can assign decimal
 */
	
	public static void main(String[] args) {
		
		byte length = 3;
		System.out.println(length);
		
		byte Width = 4;
		System.out.println(Width);
		// byte 9num=100; variables names must start with a~z, A~Z
		
		byte num_and$ = 90; 
		
		//byte length = 6; variable name here is not unique
		
		//byte public =199; variable names cannot be java reserved words
		
		// byte myNum1 = -129; out of byte' range
		
		byte myNum2 = 127;
		
		//short num2 = &; we can only assign whole numbers
		
		short num3 = 10000;
		//short num4 = 100000; out of range
		
		int num4 = -100000;
		// int num4 = 1,000,000,000; it is not work
		
		int num5 = 1_000_000_000; //easier to read (just like accounting)
		
		long longNumber = 10l;
		
		//int num6 = 10L;
		
		byte byteNumber = 10;
		short shortNumber = byteNumber; // short is greater than byte
		
		short shortNumber2 = 18;
	//  byte byteNumber2 = shortNumber2; short is greater than byte
		
		int intNumber = -19876;
		long longNumber2 = intNumber; //long is greater than int
		//left side of the = has to be equal or greater than the right side of =
		
		
		
		//int exampleNum = 10.5; 
		float exampleNum2 = 10.5f;
		float exampleNum3 = 20.5F;
		
		double doubleNum = 10.5;
		
		double doubleNum2 = 30.5;
		//float floatNum = doubleNum2; double > float
		System.out.println("===================================");
		byte bNum = 10;
		short sNum = 20;
		int iNum = 30;
		long lNum = 40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println("==================================");
		float fNum = bNum;
		float fNum2 = sNum;
		float fNum3 = iNum;
		float fNum4 = lNum;
		
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		
		System.out.println("===============================");
		double dNum = bNum;
		double dNum2 = sNum;
		double dNum3 = iNum;
		double dNum4 = lNum;
		
		System.out.println(dNum);
		System.out.println(dNum2);
		System.out.println(dNum3);
		System.out.println(dNum4);
	}
}
