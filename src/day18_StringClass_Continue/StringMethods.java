package day18_StringClass_Continue;

public class StringMethods {
	
	public static void main(String[] args) {
		
		/*
		indexOf(str): returns the index number of the first
		occurred character in the given String as an int value
		 */
		
		String  A1 = "Batch 12 is a great batch";
	int num = 	A1.indexOf("g");
		
		System.out.println(num);
		
		int num2 = A1.indexOf("at ");
		System.out.println(num2);
		
		String B1 = "today is tuesday, today we have class in the afternoon";
		
		int num3 = B1.indexOf("te");
		System.out.println(num3);
		
		String Address = " 7925 Jones Branch Dr, McLean, VA 22003";
		int begin = Address.indexOf(",")+1+1;
		int end = Address.indexOf(", V");
		String cityName = Address.substring(begin, end);
		
		System.out.println(cityName);
		
		String email = "Random.Emails@gmail.com";
		int begin2 = email.indexOf("@")+1;
		int end2 = email.indexOf(".c");
		String emailType = email.substring(begin2,end2);
		System.out.println(emailType);
		
		/*
		 lastIndexOf(): returns the last occurred character
		 index number as an Int value
		 */
		
		String str = "AADFVBMNBMNMNKJ";
		int n2 = str.lastIndexOf("B");
		int n3 = str.indexOf("B");
		System.out.println(n2);
		System.out.println(n3);
		
		String myEmail = "myemail.school@gmail.com";
		int Begin = myEmail.indexOf("@")+1;
		int End = myEmail.lastIndexOf(".");
		
		String myEmailType = myEmail.substring(Begin, End);
		System.out.println(myEmailType);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
