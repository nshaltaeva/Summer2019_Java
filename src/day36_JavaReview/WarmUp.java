package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;


public class WarmUp {
	
	/*
	 WarmUp:
    1. write a return method that can remove the duplicated objects 
    from an Integer arraylist
    2. write a return method that can remove the duplicated objects 
    from a String arraylist
    3. write a return method that can remove the duplicated objects 
    from a Character arraylist
    4. write a return method that can remove the duplicated objects 
    from a Double arraylist
	 */

	
	public static void main(String[] args) {
	//task01	
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3));
	list = RemoveDup(list);	//[1,2,3]
	System.out.println(list);	
		
	//task02
	String [] names = {"Sherinay", "Denis", "Nurzat", "Nurzat", "Seyfo", "Seyfo", "Seyfo"};
	ArrayList<String> list2 = new ArrayList<>(Arrays.asList(names));
	list2 = RemoveDup2(list2);	
	System.out.println(list2);	
	
	//task03
	Character [] ch = {'a', 'D', 'n', 'N', 'S', 'S', 'S'};
	ArrayList<Character> list3 = new ArrayList<>(Arrays.asList(ch));
	list3 = RemoveDup3(list3);	
	System.out.println(list3);	
	
	//task04
		Double [] doubleNums = {2.5, 2.5, 2.5, 3.0, 3.0};
		ArrayList<Double> list4 = new ArrayList<>(Arrays.asList(doubleNums));
		list4 = RemoveDup4(list4);	
		System.out.println(list4);	
	}
	
	//task01
	
	public static ArrayList<Integer> RemoveDup (ArrayList<Integer> list){
		ArrayList<Integer> result = new ArrayList<>();
	/*	
		for(Integer each : list) {
			if (! result.contains(each)) {
				result.add(each);
			}
		}
		return result;
		*/
//	here is a solution with for loop	 
		for(int i =0; i<list.size();i++) {
			if( ! result.contains(list.get(i))) {
				result.add(list.get(i));
			}	 
		}
		return result;
	}	
	
	//task02
	public static ArrayList<String> RemoveDup2 (ArrayList<String> list){
		ArrayList<String> result = new ArrayList<>();
		 
		for(int i =0; i<list.size();i++) {
			if( ! result.contains(list.get(i))) {
				result.add(list.get(i));
			}	 
		}
		return result;
	}
	
	//task03
	public static ArrayList<Character> RemoveDup3 (ArrayList<Character> list){
		ArrayList<Character> result = new ArrayList<>();
		 
		for(int i =0; i<list.size();i++) {
			if( ! result.contains(list.get(i))) {
				result.add(list.get(i));
			}	 
		}
		return result;
	}	
	
	//task04
		public static ArrayList<Double> RemoveDup4 (ArrayList<Double> list){
			ArrayList<Double> result = new ArrayList<>();
			 
			for(int i =0; i<list.size();i++) {
				if( ! result.contains(list.get(i))) {
					result.add(list.get(i));
				}	 
			}
			return result;
		}	
	
	
	
	
	
}
