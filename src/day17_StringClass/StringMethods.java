package day17_StringClass;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str1 ="Hello Javengers";
		String str2 ="Hello Javengers";
		
		boolean R1 = str1 == str2; //true
		System.out.println(R1);
		
		String str3 = new String("Hello Javengers");
		String str4 = new String("Hello Javengers");
		
		boolean R2 = str3 == str4;
		System.out.println(R2); //false
		
		/*
		 Methods:
		 1. concat, 2. length, 3.charAt, 4.toUpperCase, 5. toLowerCase
		
		 */
		
		//concat(str): it takes String, and combines the two Strings and returns it as new String Value
		
		String a = "Cybertek";
		a.concat("School");//Cybertek School
		System.out.println(a);
		a = a.concat("School");// a = "Cybertek School"
		System.out.println(a);
		
		//length(): it returns the total number of the characters as an int value
		
		String LongName = "AADFCHVJBVHHVHVV";
		int num = LongName.length();
		System.out.println(num);
		
		//charAt(indexNum): it returns the character of the index number
		// as a char value
		
		String name1 = "Muhtar";
		//   index      012345
		
		char ch = name1.charAt(5);
		System.out.println(ch);
		
		/*
		 toUpperCase(): converts the String value to Upper Case
		 				and returns it as new String value
		 
		 toLowerCase():converts the String value to Lower Case
		 				and returns it as new String value
		 */
		
		String name2 = "cybertek";
		name2.toUpperCase();
		System.out.println(name2);
		name2 = name2.toUpperCase();
		System.out.println(name2);
		
		String name3 = "CYBERTEK";
		name3.toLowerCase();
		System.out.println(name3);
		name3 = name3.toLowerCase();
		System.out.println(name3);
		
		/*
		 trim(): it's used for removing to unused spaces returns a NEW string value
		 */
		
		String s1 = "         hello        ";
		s1 = s1.trim();
		System.out.println(s1);
		
		
		String s3 = "  ";
		s3= s3.trim();
		System.out.println(s3);
		
		String s4 = "         Cybertek    School";
		s4 = s4.trim();
		System.out.println(s4);
		
		/*
		 substring(beginning index): it creates sub value of the String
		 from the beginning index till the last index 
		 returns as a New String Value 
		 */
		String Str = "Cybertek School";
		//            0123456789
		
		String Str2 = Str.substring(9);
		//Str = Str.substring(9);
		//System.out.println(Str);//School
		System.out.println(Str2);
		
		String address = "McLean VA 22000";
		String zipcode = address.substring(10);
		System.out.println(zipcode);
		
		/*
		 substring(beginning index, ending index): 
		 it creates the sub value of the String from the beginning
		 index till the ending index
		 (ending index num will be excluded)
		 then it returns as a new String value
		 */
		
		String Name = "Hello Cybertek School";
		Name = Name.substring(6, 13+1);//"Cyberte"+1 ==>"Cybertek
		System.out.println(Name);
		
		String fullName = "Cybertek School Batch12";
		String middleName = fullName.substring(9, 15);
		System.out.println(middleName);
		
		
		 	
		
		
		
		
		
		
		
		
		
		
		
	}

}
