package day20_JavaRecap;

public class QuizReview {
	public static void main(String[] args) {
		
		//q1:
		int a =5;
		String str = "Hello World";
		//            012345
		System.out.println(str.substring(0, 11));
		
		System.out.println(str.substring(a -= a/1, a += 5));
		//                                a = a-5    a =5
		int a1 = 5;// a1 = 6
		System.out.println(str.substring((++a1 - a1--)%1, 11%6));
		//                                 6      6%1       5
		
		//q3
		String s1 = "Java";
		String s2 = "java";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
	
		//g4
		String str1 = " ";
		System.out.println(str1.trim().isEmpty());//true
		System.out.println(str1.isEmpty());//false
		
		//q5
		String A1 = "lava";
		String A2 = new String ("lava");
		System.out.println(A1==A2);// different location
		System.out.println(A1.equals(A2));//true. same visible text
		
		//q6
		String B1 = "Cybertek"; //String pool
		String B2 = new String(B1);//heap
		String B3 = B2;//heap
		
		System.out.println(B3==B2);//true
		System.out.println(""+B3.equals(B2));//true
		
		//q10
		int z = 5;
		for(int i = 5; i>0;i--) {//i=5,    i =4,   i =3,  i = 2, i = 1
			z += i;              //z =10,  z = 14,  z=17  z = 19 z=20
		}
		System.out.println(z);
		
		//q11
		int i = 0;
		for(i = 5; i < 10;) {//i: 5, 7, 9, 
			i += 2;           // final value of i: 9+2 = 11
		}
		System.out.println(i);
		
		
		
		for (int j = 1; j < 5;) {
			j++;
			System.out.print(j+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
