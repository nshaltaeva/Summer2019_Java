package day14_Scanner;

		import java.util.Scanner;// everything in scanner class is imported
	//	import java.util.*;
public class ScannerClass {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a Byte Value");
	byte byteNum = input.nextByte();//byte value
	
	System.out.println("You have entered: "+byteNum);
	
	System.out.println("Enter a Byte Value 2");
	byte byteNum2 =	input.nextByte();
	
	System.out.println("You have entered: "+byteNum2);
	
	System.out.println("Addition is: "+(byteNum+byteNum2));
	System.out.println("Substaction is: "+(byteNum-byteNum2));
	System.out.println("Multiplication is: "+(byteNum*byteNum2));
	System.out.println("Division is: "+(byteNum/byteNum2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
