package day30_WrapperClass_ArrayList;

public class WrapperClassMethods2 {
	public static void main(String[] args) {
		
		//ValueOf methods: converts String value to Wrapper class values, returns wrapper
		
		int z = Integer.valueOf("1234");
		Integer z1 = Integer.valueOf("1234"); //none
		
		Integer z2 = (int) Integer.valueOf("1234");//auto-boxing
		System.out.println(z2);
		
		
		boolean result = ! Boolean.valueOf("False");//un-boxing
		//ignores the case sensitivity
		System.out.println(result);
		
		
		
		int totalNum = 100;
		String str3 = ""+totalNum;//none of the boxing
		System.out.println(str3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
