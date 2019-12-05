package day18_StringClass_Continue;

public class StringMethods_Boolean {
	
	public static void main(String[] args) {
		
		/*
		 isEmpty(): checks if the String is empty
		 returns boolean expression
		 empty == true,         not empty == false
		 */
		
		String str = "Cybertek";
		boolean R1 = str.isEmpty();
		System.out.println(R1);
		
		String str2 = "";
		if (str2.isEmpty()) {
			System.out.println("it is empty String");
		}else {
			System.out.println("it is not empty");
		}
		
		/*
		 equal(str): checks if the two String' visible text
		 are equal or not then returns boolean expression
		 equal ==> true     !equal ==> false
		 */
		
		String A1 = "Cybertek";
		String A2 = new String("Cybertek");
		
		boolean R2 = A1.equals(A2);
		System.out.println(R2);
		
		System.out.println("java".equals("Java"));//false, case sensitivity
		
		/*
		 equalsIgnoreCase(str):  
		 */
		String s1 = "JAVA";
		String s2 = new String("java");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));
		
		/*
		 contains(str): checks if the str is contained in the 
		 String or not, then returns boolean expression
		 
		 contained ==> true     !contained ==> false
		 */
		
		String name = "Muhtar";
		boolean result = name.contains("good guy");//false
		
		System.out.println(result);
		System.out.println("====");
		String name2 = "Marufjon";
		System.out.println(name.contains("M"));
		
		/*
		 startsWith(str): checks if the String is started with
		 the given str or not, then returns boolean expressions
		 */
		
		String Today = "Java";
		
		boolean R3 = Today.startsWith("J");
		
		System.out.println(R3);
		
		String names = "Cybertek School is a great place to learn java";
		System.out.println(names.startsWith("Cybertek School"));//true
		
		
		/*
		 endsWith(str): checks if the String is ended with
		 the given str or not, then returns boolean expressions
		 */
		
		String B1 = "Muhtar";
		System.out.println(B1.endsWith("R"));//false
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
