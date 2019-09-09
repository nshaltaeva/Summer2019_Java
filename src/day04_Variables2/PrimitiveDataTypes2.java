package day04_Variables2;

public class PrimitiveDataTypes2 {
	
	/*
	 *Primitives: byte, short, int, long, float, double, char, boolean
	 * 
	 * boolean: takes all boolean expression, and return to either true of false
	 * 
	 * char: declared with in the single qoute ''; single character only
	 * ASCII table: a universal system that is recognized by all computers. Each characters in ASCII table has a corresponding number to represent it.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9>3;
		boolean result4 = 4<3;
		//boolean result = Earth is Flat; 
		//boolean num = 100; boolean only takes true or false results
		
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//char
		char char1 = 'a';
		System.out.println(char1);
		
		//char char2 = 'ab'; only single character
		char char2 = '9';
		char char3 = '#';
		//char with numbers
		char char4 = 67;
		System.out.println(char4);
		
		char char5 = 'C'; //prints the character as it is
		
		char char6 = 123;
		System.out.println(char6); //prints the character that it has the number of 123 from ASCII table
		
		//initializing char to other primitives: byte, short, int, long, float, double
		char MyChar1     =    'b';
		//variable name      value
		//int MyInt = 'b'
		int MyInt = MyChar1; //the number that represents 'b' is initialized to the int
		System.out.println(MyInt); //98
		
		//byte MyByte = MyChar1; char's memory is 2 byte, byte's  - 1 bytes
		byte MyByte2 = 'b'; // b's corresponding number is 98
		System.out.println(MyByte2);
		
		//short ShortNum = MyChar1; char' memory is could be bigger than short, range is great
		short ShortNum2 = 'b'; // b's corresponding number 98 from ASCII 
		
		long LongNum = MyChar1; //long's memory is 8 bytes
		long LongNum2 = 'b'; //98
		
		float FloatNum = MyChar1;
		float FloatNum2 = 'b';
		System.out.println(FloatNum2);
		
		double doubleNum = MyChar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum2);
		
		
		char mycharValue = 9999;
		System.out.println(mycharValue);
		
		
		
	}

}
