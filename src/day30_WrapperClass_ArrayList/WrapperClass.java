package day30_WrapperClass_ArrayList;

import java.util.Arrays;

public class WrapperClass {
/*
 		primitives                       wrapper-class
 		  byte								Byte
 		  short		Auto-boxing				Short
 		  int	=================>			Integer
 		  long								Long
 		  float								Float
 		  double		up-boxing			Double
 		  boolean	<============== 		Boolean
 		  char								Character
 		  
 		  default values of primitive:
 		  byte,short,int,long = 0
 		  double,float = 0.0
 		  boolean = false
 		  char = space
 		  
 		   default values of wrapper calsses: null
 		   
 		  
 */
	public static void main(String[] args) {
		
		int numInt = 10;
		Integer numInteger =10;
		
		double numdouble = 5.5;
		Double numDouble = 5.5;
		
		long numlong = 20L;
		Long numLong = numlong; //Auto-Boxing is process that converting primitive class to wrapper class
		
		System.out.println(numlong);
		System.out.println(numLong);
		
		Boolean BooleanResult = false;
		boolean booleanresult = BooleanResult;//unboxing - converting wrapper class to primitive
		
		
		char ch1 = 'L';
		Character ch2 = ch1; //Auto-boxing
		
		char ch3 = ch1; //none
		
		char ch4 = ch2; //up-boxing
		
		Character ch5 = ch2; //none, just assigning
		
		
		int [] arr = new int [3]; //[0,0,0]
		System.out.println(Arrays.toString(arr));
		
		Character [] arr1 = new Character [3]; //[null,null,null]
		System.out.println(Arrays.toString(arr1));
		
		int num1 = 10;
	//	num1.method(); // primitives does not have methods
		
		Integer num2 = 10;
		int n = num2.MAX_VALUE;
		System.out.println(n);
		
		
		
		
		
	}
}
