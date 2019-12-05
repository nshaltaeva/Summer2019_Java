package day32_JavaReview;

public class WrapperClass_Review {
public static void main(String[] args) {
	/*
		primitives                       wrapper-class: java.lang
		  byte								Byte
		  short		Auto-boxing				Short
		  int	=================>			Integer
		  long								Long
		  float								Float
		  double		up-boxing			Double
		  boolean	<============== 		Boolean
		  char								Character
		  
	wrapper class vs. primitives	  
		  
	1.	  default values of primitive:
		  byte,short,int,long = 0
		  double,float = 0.0
		  boolean = false
		  char = space
		  
		   default values of wrapper classes: null
		   
	2.	 wrapper class Only accepts it's own primitive values  
	
	3. wrapper classes have method, primitives - do not.
	
	4. wrapper class takes object, primitives - values.
	
Wrapper	methods: Max_Values, Min_Values, parse methods, ValueOf methods
	max_value: returns the max value of the data type
	min_value: return the min value of the data type
	parse method: converts String to primitive
	valueOf method: converts String to wrapper class
	
	Auto-boxing: assign the primitives to wrapper class
    Un-boxing: assign the wrapper class to primitives
		  
*/
	int a = 10;
	Integer b =10; //Integer only accepts int primitives values
	
	byte c=20;
//	Integer b2 = c; //Integer only accepts int primitives values
	
	long L = b;//Integer is within the range of long
	
	
	boolean result = 9>0+1;
	Boolean result2 = result; //auto-boxing
	
	boolean result3 = result2; //un-boxing
	
	Boolean result4 = result2; // none of boxing //wrapper to wrapper
	
	boolean result5 = result3; //none  // primitive to primitive
	
	
	/*
	 methods:
	 		max_value
	 		min_value
	 		parse methods
	 		valueOf methods
	 */
	//max_value
	
	int max = Integer.MAX_VALUE;
//  int max2 = Double.MAX_VALUE; //int != double	
	System.out.println(max);
	
	//min_value
	 int min = Byte.MIN_VALUE;
	
	System.out.println(min);
	
	
	//parse methods:
	short s1 = Short.parseShort("1234");
	System.out.println(s1);
	
	double d1 =Double.parseDouble("78.5") ;//none
	Double d2 =Double.parseDouble("78.5") ;//auto-boxing
	
	boolean r1 = Boolean.parseBoolean("true"); //non
	System.out.println(r1);
	System.out.println(!r1);
	
	//valueOf method: returns wrapper class
	
	Integer num = Integer.valueOf("123"); //none
	System.out.println(num);
	
	int num2 = Integer.valueOf("123"); //un-boxing
	System.out.println(num2);
	
	byte num3 = Byte.valueOf("12");
	
	boolean R1 = Boolean.valueOf("TruE"); //un-boxing // ignore case sensitivity
	System.out.println(R1);
	
	
	
	
	
	
}
}
