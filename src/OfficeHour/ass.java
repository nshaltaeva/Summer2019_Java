package OfficeHour;

public class ass {
	public static void main(String[] args) {
		
		System.out.println("=1=");
		String str = " ";
		str.trim();
		 boolean A = str.isEmpty();
		 System.out.println(A);
		 
		 System.out.println("=2=");
		 String ta = "A ";
		 ta = ta.concat("B ");
		 String tb = "C ";
		 ta = ta+tb;
		 ta.replace('C', 'D');
		 ta = ta+tb;
		 System.out.println(ta);
		 
		 System.out.println("=3=");
		 String str1 = "Hello World";
		 str1.trim();
		 int z = str.indexOf(" ");
		 System.out.println(z);
		 
		 System.out.println("=4=");
		 String a = "Java";
		 String a1 = new String("Java");
		 if (a.equalsIgnoreCase(a1)) {
			 System.out.println(" == ");
		 } else 
		 {System.out.println(" != ");
		 
		 }
		 
		 System.out.println("=5=");
		 String s = "Batch 12";
		 int Z = s.trim().length();
		 System.out.println(Z);
		 System.out.println("    ");
		 
		 System.out.println("=6=");
		 String s1 = "abc";
		 String s2 = "abc";
		 System.out.println("s1 == s2 is: "+ (s1==s2));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }

}
