package day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
	public static void main(String[] args) {
		
		
		String[] Allstudents = {"Nurzat", "Mehmet", "Dogan", "Madina", "Tulha"};
		//Array's suze is fixed
		Allstudents[0] = "Muhtar";
		Allstudents[3] = "Sefran";
		System.out.println(Allstudents[0]+Allstudents[3]);
		
		//initialize the size without giving value
		int[] array = new int[4];//we haven't given values to the array
		//this array can contain 4 values only, it's length is 4
		System.out.println(array.length);
		System.out.println(array[0]);
		//give values to the array
		array[1] = 100;
		System.out.println(array[1]);
		array[0] = 200;
		System.out.println(array[0]);
		
		/*array[4] = 500;
		System.out.println(array[4]);//array size is fixed
		*/
		
	//	int[] array2;
	//	System.out.println(array2);//array size must be initialized
		
		
		Scanner scan = new Scanner(System.in);
		int [] Inputs = new int [5];//in this array we can store 10 elements
		                            // highest index is 9
		
		for(int i=0; i<Inputs.length; i++) {
			System.out.println("Enter a num");
			Inputs[i] = scan.nextInt();
		}
		
		for(int i=0; i<Inputs.length; i++) {
			System.out.print(Inputs[i]+" ");
		}
		
		String[] AllStudentsNames = new String[358];
		AllStudentsNames = new String[500];//resize the array
		// new keyword in array is used to give the size of the array
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
