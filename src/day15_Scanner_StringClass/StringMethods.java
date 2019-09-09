package day15_Scanner_StringClass;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str = "Cyb ertek";
		//index num:  01234567
		
		//charAt(index)
		
		System.out.println(str.charAt(3));
		
		char ch = str.charAt(0);
		System.out.println(ch);
		
		// length (); returns length of sentence
		
		String name = "Nurzat Shaltaeva";
		System.out.println(name.length());
		
		//concat();
		
		String s1 = "Cybertek";
		s1.concat("School");//attempt to mofify String s1
		//returns a brand new String value
		
		System.out.println(s1);// String is immutable, Cybertek 
		
		s1 = s1.concat(" School");
		
		System.out.println(s1);
		
		// toUpperCase();		
		
		String N = "Cybertek";
		N.toUpperCase();
		System.out.println(N);//cybertek, String is immutable(non change)
		N = N.toUpperCase();
		System.out.println(N);
		
		String name1 = "nurzat";
		
	//	name1 = name1.toUpperCase();
		System.out.println(name1.toUpperCase());
		
		
		//toLowerCase();
		
		System.out.println(N.toLowerCase());
		
		String name2 = "NURZAT";
		name2.toLowerCase();
		System.out.println(name2);//NURZAT, because String is immutable
		
		name2 = name2.toLowerCase();
		System.out.println(name2);
		
		/*
		 charAt(index), length(), concat (Str), toUpperCase(); toLowerCase()
		 
		 */
		
		String a = "Batch 12 Javengers";//18 characters
		System.out.println(a.charAt(9));
		
		char ch1 = a.charAt(14);
		System.out.println(ch1);
		
		int L1 = a.length();
		System.out.println(L1);
		
		int HighestIndexNum = L1 - 1;//or a.length() - 1;
		System.out.println(HighestIndexNum);
		
		String b = "Cybertek";
		b.concat(" Batch 12 Javengers");
		System.out.println(b);
		String c = b.concat(" Batch 12 Javengers");
		System.out.println(c);
		b = b.concat(" Batch 12 Javengers");
		System.out.println(b);
		
		String d = "book";
		System.out.println(d.toUpperCase());
		
		System.out.println(d);
		d = d.toUpperCase();
		System.out.println(d);
		
		String e = "JAVA IS FUN";
		e.toLowerCase();
		System.out.println(e);
		
		e = e.toLowerCase();
		System.out.println(e);
		
		
		
		
		
		
	}

}
