package day20_JavaRecap;

import java.util.Scanner;

public class StringMethods {
/*
 methods: 
 substring indexOf, lastIndexOf, replace, replaceFirst, 
 equals, equalsIgnoreCase, contains, startsWith, endsWith, 
 charAt, trim, length, isEmpty, toUpperCase, toLowercase
 */
	public static void main(String[] args) {
		
		/*
		 substring: creating the sub value of the String
		 */
		String str = "Cybertek School";
		str.substring(0, str.indexOf(" "));
		System.out.println(str);
		str = str.substring(0, str.indexOf(" "));
		System.out.println(str);
		
		String str2 = "Cybertek School";
		str2.substring(str2.indexOf("S"));
		System.out.println(str2);
		str2=str2.substring(str2.indexOf("S"));
		System.out.println(str2);
		
		
		/*
		 indexOf: returns the first occurred values's index number
		 */
		String s1 = "Java is a fun language, I Love java, good";
		System.out.println(s1.indexOf("a")); //1
		System.out.println(s1.indexOf("ag")); //19
		
		/*
		 lastIndexOf: returns the last occurred values's index number
		 */
		
		String s2 =  "Java is a fun language, I Love java, java";
		System.out.println(s2.lastIndexOf("a"));//34
		System.out.println(s2.lastIndexOf("ava"));//32
		
		
		/*
		 replace: replaces all the occurred old value with new one
		 */
		String name = "Cybertek School Batch 12";// print without the space
		int length = name.length();
		System.out.println(length);
		
		name = name.replace(" ", "");
		System.out.println(name);
		System.out.println(name.length());
		
		name = name.replace("e", "a");
		System.out.println(name);
		
		name = name.replace("School", "Family");
		System.out.println(name);
		
		
		/*
		 replaceFirst: replaces first the occurred old value with new one
		 */
		String A1 = "Java is Fun, Java is object oriented, Java is cool";
		
		A1 = A1.replaceFirst("Java", "C++");
		System.out.println(A1);
		
		A1 = A1.replace("Java is o", "C++ is o");
		System.out.println(A1);
		
		A1 = A1.replace("d, Java", "d, C#");
		System.out.println(A1);
		
		/*
		 ==, equals, equalsIgnoreCase:
		 */
		String R1 = "Cybertek";
		String R2 = new String("Cybertek");
		String R3 = new String("cybertek");
		
		System.out.println(R1 == R2);//false, different location
		
		System.out.println(R1.equals(R2));//true
		System.out.println(R1.equals(R3));//false, case sensitivity
		
		System.out.println(R1.equalsIgnoreCase(R3));//
		//true, it checks the visible text without case sensitivity
		
		/*
		 trim: remove the unused spaces
		 */
		
		String spaces = "       M      ";
		spaces = spaces.trim();
		System.out.println(spaces);
		
		String N1 = "        ";
		N1 = N1.trim();
		System.out.println(N1.isEmpty());
		
		String N2 = "       Tomorrow is gonna be a great day to do replt.its";
		N2 = N2.trim();
		System.out.println(N2);
		
		/*
		 charAt: returns a specific character from the String
		 */
		
		String C1 = "Cybertek";
		//           01234567
		char ch = C1.charAt(4); //'r'
		System.out.println(ch);
		
		String C2 = "Please do more and more java practices tomorrow";
		
		char ch2 = C2.charAt(C2.lastIndexOf("w"));
		System.out.println(ch2);
		
		String sentences = "Tomorrow we dont have class";
		System.out.println(sentences.charAt(0));
		System.out.println(sentences.charAt(sentences.length()-1));
		
		String result = ""+sentences.charAt(0)+" "+sentences.charAt(sentences.length()-1);
		
		System.out.println(result);
		
		//startsWith & endsWith: returns boolean, checks the starting and ending values
		
		String Gmail = "cybertekschool@gmail.com";
		boolean R = Gmail.endsWith("@gmail.com");
		System.out.println(R);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your email address");
		String GmailAddress = scan.nextLine().toLowerCase();
		
		if (GmailAddress.endsWith("@gmail.com")){
			System.out.println("it is a valid gmail address");
		}else {
			System.out.println("it is invalid address");
		}
		
		
		//starts with www.
		System.out.println("Enter a web Address");
		String URL =scan.nextLine().toLowerCase();
		
		if(URL.startsWith("www.") && URL.endsWith(".com")) {
			System.out.println("it is a valid web address");
		}else {
			System.out.println("it is invalid web address");
		}
		
		//contains: checks if the given value is contained in the 
		// String or not
		
		String salary = "1000$";
		boolean res2 = salary.contains("$");
		
		System.out.println(res2);
		
		//concat: concates two String values
		
		String SchoolName = "Cybertek";
		 SchoolName = SchoolName.concat(" School");
		System.out.println( SchoolName);
		
		String schoolName = "cybertek"+1234;
		// "+" concats any value to the String, "concat" concats just String
		System.out.println(schoolName);
		
		
		
		
	}
}
