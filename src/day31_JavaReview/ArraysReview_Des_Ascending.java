package day31_JavaReview;

import java.util.Arrays;

public class ArraysReview_Des_Ascending {
	/*
	 Array: store multiple data to a variable
	 Array's size is fixed
	 */
	public static void main(String[] args) {
		
		int num = 10;
		
		//declaration of array:
		int [] arr = {10}; //array has size of 1, size i fixed
	//	arr[1] = 20; // out of bound 
		
		//initializing the array's size
		
		int [] arr2 = new int[2]; //[0,0] maximum capacity of the array is 2
		
		System.out.println(arr2[0]);
		
		
		String [] cars = new String [5];//this array can contain 5 string value
		//{Tesla, Audi, Toyota, Jeep, Subaru}
		
		cars[4] = "Subaru";
		cars[2] = "Toyota";
		cars[1] = "Audi";
		cars[3] = "Jeep";
		cars[0] = "Tesla";
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		cars = new String [10];
		//{"Ford", "Honda","BMW", "Volvo", "Volkswagen"}
		
		cars[5] = "Ford";
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		
		
		
		boolean [] bool = {10>9, "Mikray".equals("Seyfo")};
		
		boolean b1 = bool[1];
		System.out.println(b1);
		System.out.println(Arrays.toString(bool));
		
		
		//Arrays.sort(VariableName): sorts the array in ascending order
		
		double[] dArray = {1000, 900,800,700,600};
		System.out.println(Arrays.toString(dArray));
		
		//exeplted: {600,700,800,900,1000}
		Arrays.sort(dArray);
		System.out.println(Arrays.toString(dArray));
		
		//print each values of the given array in descending order
		int [] numbers = {200, 300, 20, 7890, 40, -9, -100};
		
		Arrays.sort(numbers); // sorts the array in ascending order
		System.out.println(Arrays.toString(numbers));
		
		String result = "";
		for(int i=numbers.length-1; i >= 0; i--) {
			result += numbers[i]+", ";
		}
		result = result.trim();
		result = result.substring(0,result.lastIndexOf(","));
		System.out.println(result);
		
	
		
		
		
		
		
		
		
		
		
		
		}
			
	

}
