package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	/*
	 Declaration of ArrayList:
	 ArrayList<ClassType> variableName = new Arraylist<>();
	 ArrayList<ClassType> variableName = new Arraylist<>(ClassType);
	 */
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(10); //auto boxing
	list2.add(20); 
	list2.add(30);
	
	System.out.println(list2);
	
	//get(num); gives index number from array
	System.out.println(list2.get(1));//20
	
	//size(); to order to find the length of array
	
	System.out.println(list2.size());
	
	//clear(); clears the array, removes all the values from the array
	list2.clear();
	
	System.out.println(list2);
	
	
	
	
	
	
	
	
	
	
}
}
