package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		
		
		/*
		 split(str): splits the String be the given value and returns
		 it is as String array
		 
		 */
		
		
		String sentence = "Today is great day, Good day to learn java";
		
		String [] arr= sentence.split(" ");	
		
		System.out.println(Arrays.deepToString(arr));
		
		
		String email = "FirstName_LastName";
		String[] arr2 = email.split("_");
		String str = Arrays.toString(arr2);
		
		System.out.println(str.replace("[", "").replace("]", ""));
		
		String fullname = "Cybertek School Batch12";
		
		String [] array = fullname.split(" ");
		System.out.println(Arrays.toString(array));
		
		
		String java = "I love Java and Java is fun, life is Java ";
		//             I love   |  and   |   is fun, I love  |
		      String[] array2 = java.split("Java");
		System.out.println(Arrays.toString(array2));
		System.out.println(array2.length-1);//java is occurred 3 times
		
		
		
		String Python = "Python is good, I like Python, Python is life, Python is good";
		String [] array3 = Python.split("Python");
		System.out.println(array3.length-1);
		
		String emailadd = "Cybertek.school.batch12@gmail.com";
		
		String FullName = emailadd.substring(0, emailadd.indexOf("@"));
		System.out.println(FullName);
		
		String [] AllNames = FullName.split("//.");
		System.out.println(Arrays.toString(AllNames));
		
		String words = "ABCDEFG";
		String [] array4 = words.split("");
		
		System.out.println(Arrays.toString(array4));
		
		
		
		/*
		 toCharArray(): returns a char array from the String
			 		 
		 */
		
		String Str = "Nurzat";
		char[] ch = Str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
