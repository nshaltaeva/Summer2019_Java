package day05_Recap;

public class Primitives_Review {
	
	/*
	 	Primitivies:
	 			byte: only takes whole numbers
	 			short: only takes whole numbers
	 			int: only takes whole numbers
	 			long: only takes whole numbers
	 			float: can takes decimals (must have F/f at the end)
	 			double: can takes decimals
	 			boolean: true or false
	 			char: characters within single '' and also takes numbers
	 Range: double>float>long>int>short>byte
	  
	 */
	
	
	public static void main(String[] args) {
		
		//System.out.println(bNum); java application are executed from top to buttom
			byte bNum = 127; 
			// byte range: -128 to 127
			//byte bNum2 = 126.5; // byte only takes whole numbers
		
			short sNum = 1000;
			//short sNum = 126.5; // only whole number
			//bNum = sNum; // short is greater than byte
			
			sNum = bNum; //sNum = 127;
			System.out.println(sNum);
			
			short sNum3 =127;
			//byte bNum5 = sNum3; //short > byte
			
			int iNum = 100;
			System.out.println(iNum);//100
		//	int iNum2 = 100.5; //int takes whole numbers only
			
		//	byte bNum5 = iNum; //int>byte
		//	short sNum = INum; // int>short
			
			short shortNum = 105;
			iNum = shortNum;
			System.out.println(iNum);//105
			
			long LongNum = 100L;
			
		//	byte ByteNum3 = LongNum; 
		//	short ShortNum4 = 100l;
		//	int IntNum3 = 100L;  long>int,byte,short
			
			byte a=10;
			int b = 30;
			short c =40;
			
			long LongNumber = a;
			long LongNumber1 = b;
			long LongNumber2 = c;
			
			
			float floatNum = 10.5f; //must have f/F at the end
			
			short a1 =10;
			byte b1 = 20;
			long c1 =30;
			int d1 =40;
			
			float Float1 = a1;
			float Float2 = b1;
			float Float3 = c1;
			float Float4 = d1;
			System.out.println(Float1);//10.0
			
		// double takes all the whole and decimal numbers	
			double DoubleNum1 = 10L; //long is smaller then double
			System.out.println(DoubleNum1);
			
			boolean result = true;
			boolean result1 = false;
			
			boolean result2 = 9>10;
			
			
			char character1 = 'A';
			System.out.println('A');//character A
			
		//	char character2 = A; must be declared within ' ' quotes
		// char character3 = 'AA'; only single character
			
			//all the characters have representitive number:
			
			char charvalue = 98;
			System.out.println(charvalue);//character
			
			int num3 = 'B';
			System.out.println(num3);// represent number is 66
			
			float fnum = 'B';
			System.out.println(fnum);
			
			byte bnum = 'B';
			System.out.println(bnum);
			
			float fnum2 = 5.5f;//5.5
			float fnum3 = 5; //5.0
			
			
			char specialChar = 55000;
			System.out.println(specialChar);
			
			//practices:
			
			/*
			 8, 9, #, @, 8.5, 5.5f, 
			 128, 40000, 9>10, true, false
			 */
			
			byte Bnum = 8; short Snum = 8; int Inum = 8; 
			long Lnum = 8; float Fnum = 8; double Dnum = 8;
			char Cnum = '8';
			
			System.out.println(Bnum);//8
			System.out.println(Snum);//8
			System.out.println(Inum);//8
			System.out.println(Lnum);//8
			System.out.println(Fnum);//8.0
			System.out.println(Dnum);//8.0
			System.out.println(Cnum);//8
			
			//# and @:
			char char2 = '#';
			System.out.println(char2);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
