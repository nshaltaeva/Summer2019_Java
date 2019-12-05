package day23_Arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		/*
		 Arrays: a variable that we can store multiple values
		 Regular variable a=10; can store just one value
		 
		 Arrays: int[] variableName = {10,20,30,40};
		 each values(Elements) have their own index number
		  int[] variableName = {10,20,30,40};
		  //index num:           0  1  2  3
		   * 
		   to retrieve data of the array:
		   variableName[indexNumber of data]
		   
		   ex: variableName[3] ==> 40
		   
		   Array is immutable, and Array's size is fixed
		   
		   Array's size must be initialized, there are two ways
		   we can initialize Array's size:
		   1. giving values: 
		   int [] a = {1,2,3];
		   2. giving the size only:
		   int [] a = new int[4];
		 
		 */
		
		int[] arr = {1, 2};
		
		String[] names = {"Nigar", "Sumeya", "Madina"};
		//index num:        0        1          2
		
		System.out.println(names[0]);
		
		String str1 = names[2];
		System.out.println(str1);
		
		double[] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
		//index:            0  1  2 3 4 5  6  7  8
		
		for (int i=0; i < 8; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		//length
		String str = "ABC";
		int A = str.length();
		System.out.println(A);
		
		
		int[] Numbers = {12,24,48,96,2,3,4,5,6,7,8,9,10,11};
		
		/*
		 length of Array: 
		 Numbers.length;
		 */
		int B = Numbers.length;
		System.out.println(B);
		
		int HighestIndexNum = Numbers.length-1;
		System.out.println(HighestIndexNum);
		
		for (int i=0; i <Numbers.length; i++) {
			int s1 = Numbers[i];
			System.out.print(s1+" ");
		}
		System.out.println();
		
		
		char[] myChars = {'A', 'B', 'C', 'D'};
		int HighestIndexChar = myChars.length-1;
		System.out.println(HighestIndexChar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
