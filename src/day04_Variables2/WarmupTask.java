package day04_Variables2;

public class WarmupTask {
 /*
   1. Cucumber = 2.5 =>float of double
   2. Tomato = 3
   3. Onion = 1.5
   4. Pepper = 2
   5. Carrot = 4
   
   Expected Result ;

1 Cucumber is 2.5 dollars
4 Tomatoes are 12 dollars
2 Onion is 3 dollars
1 Pepper is 2 dollars
6 Carrot is 24 dollars
 
  */
	public static void main(String[] args) {
		//Cucumber: 2.5
	//	int Cucumber = 2.5; not demical, in should be whole numbers
		 
		float Cucumber = 2.5f; //float can not contain double
		double Cucumber2 = 2.5f; //double can contain float
		double Cucumber3 = 2.5;
		
		//Onion: 1.5
		
		float Onion = 1.5F;
		double Onion2 = 1.5;
		
		//Pepper: 2
		byte Pepper = 2;
		short Pepper2 = 2;
		int Pepper3 = 2;
		long Pepper4 = 2l;
		float Pepper5 = 2; //only time we add F(f) is when we are assining decimal
		double Pepper6 = 2;
		
		/*
		System.out.println(Pepper);
		System.out.println(Pepper2);
		System.out.println(Pepper3);
		System.out.println(Pepper4);
		System.out.println(Pepper5); //double and float converts to decimal
		System.out.println(Pepper6);
		 
		 */
		//Tomato: 3
		int Tomato = 3;
		
		//Carrot: 4
		int Carrot = 4;
		
		char char1 = 36;
		
		Cucumber2=Cucumber2*1;
		Tomato=Tomato*4;
		Onion2=Onion2*2;
		Pepper3=Pepper3*1;
		Carrot=Carrot*6;
		
		
		System.out.println("1 cucumber is " + Cucumber2 + char1);
		System.out.println("4 tomatoes are " +char1+ Tomato);
		System.out.println("2 onions are " + Onion2 + " dollars");
		System.out.println("1 pepper is " + Pepper3 + " dollars");
		System.out.println("6 carrots are " + Carrot + " dollars");
		
		System.out.println(char1);
		
		//int num 'A';
		
		
	}
}
