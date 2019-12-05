package day33_ArrayList_MethodCalls;

import java.util.ArrayList;

public class ArrayLists_MethodsPractice {
public static void main(String[] args) {
		
		//set(index number, Object):
			ArrayList<String> Javengers =  new ArrayList<>();
				Javengers.add("Jena");  // 0
				Javengers.add("Mary");  // 1
				Javengers.add("Tarah"); // 2
				Javengers.add("Mahriban"); // 3
			
				Javengers.set(1, "Seyfo");  // [Jena, Seyfo, Tarah, Mahriban]
								// Pilot Nijat Borhan
			
				Javengers.remove( 0 );
				Javengers.add(0, "Pilot Nijat Borhan");
				System.out.println(Javengers);
		
				
		// remove(int):	 removes the index
		// remove(Object): removes the first matching object and retuns boolean value
				ArrayList<Integer> numbers = new ArrayList<>();
						numbers.add(1); //0
						numbers.add(2);	//1
						numbers.add(3);	//2
						numbers.add(4);	//3
						numbers.add(5);	//4
						
						int a = 1;
						numbers.remove( a );  // remeovs index 3 ==>[1, 2, 3, 5]
					System.out.println(numbers);
					
			//	numbers.remove( Integer.parseInt( "3" ) );  // parse method returns primitives  
				boolean result = numbers.remove(  Integer.valueOf("3") ); // value of method returns wrapper class
					
				System.out.println(numbers);
				System.out.println(result);
			System.out.println("             ");		
				
			ArrayList<String> names =  new ArrayList<>();
			names.add("Rob");  // 0
			names.add("Bran");  // 1
			names.add("Rick"); // 2
			names.add("Bran"); // 3		
			names.add(3,"John");
			//if(names.remove("Bran")) {
			//	names.remove("John");
			//}
			System.out.println(names);	
			
			ArrayList<Integer> num = new ArrayList<>();
			Integer a1 = 1;
			System.out.println(num.remove(a1));
			
		
	}
}
