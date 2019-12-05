package day35_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
	
	/*
	 Warm Up: 
    1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer array and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    4. write a return method that accepts an Integer array and returns the minimum number
            DO NOT USE SORT METHOD
    5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD
Collapse
	 */
	public static void main(String[] args) {
		//task01
		int [] arr = {1,2,3,4,5};
		ArrayList<Integer> list = ArrayToArrayList(arr);
		System.out.println(list);
		System.out.println(ArrayToArrayList(arr));
		//task01-01
		double [] arr1 = {1,2,3,4,5};
		ArrayList<Double> list1 = ArrayToArrayList(arr1);
		System.out.println(list1);
		
		//task02
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		int max = MaxNum(list3);
		System.out.println(max);
		
		//task03
		ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(10,20,35,30, 35));
		int SecondMax = SecondMax(list4);
		System.out.println(SecondMax);
		
		//task04
		ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		int min = MinNum(list5);
		System.out.println(min);
		
		int [] Numbers = {-1,1,2,3,4,5,6,7};
		ArrayList<Integer> list5_1 = ArrayToArrayList(Numbers);
		int min2 = MinNum(list5_1);
		System.out.println(min2);
		
		//task05
				ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(10,20,20,35,30, 35));
				int SecondMin = SecondMin(list6);
				System.out.println(SecondMin);
	}
	
	
	//task01
	public static ArrayList<Integer> ArrayToArrayList (int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
		for(Integer each: arr) { //auto boxing
			list.add(each);
		}
		return list;
	}
	
	//task01-01
	
	public static ArrayList<Double> ArrayToArrayList (double[] arr){
		ArrayList<Double> list = new ArrayList<>();
		for(Double each: arr) { //auto boxing
			list.add(each);
		}
		return list;
	}
	
	//task02
	public static int MaxNum(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for(int each: list) { //unboxing
			if(each > max) {
				max = each;
			}
		}
		return max;
	}
	
	//task03
	public static int SecondMax(ArrayList<Integer> list) {
		//                         [90,95,100]
		Integer max = MaxNum(list); //100, object,  auto-boxing
		list.removeAll(Arrays.asList(max));
		
		int secondMax = MaxNum(list);
		return secondMax;
	}
	
	//task04
	public static int MinNum(ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;
		for(int each: list) { //unboxing
			if(each < min) {
				min = each;
			}
		}
		return min;
	}
	
	//task05
	public static int SecondMin(ArrayList<Integer> list) {
		//                         [90,95,100]
		Integer min = MinNum(list); //100, object,  auto-boxing
		list.removeAll(Arrays.asList(min));
		
		int secondMin = MinNum(list);
		return secondMin;
	}
	

}
