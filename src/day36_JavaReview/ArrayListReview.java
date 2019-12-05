package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
	//add(object): takes an object
		list.add(10);
		list.add(20);
		
	//add.(index,object): it will insert the given object at the given index
		list.add(1, 30);
		
	    //list.add(4, 40); //we cannot skip indexes, out of bound
		
		list.add(3, 50);
		System.out.println(list);
		
	//get(index num): returns the object at the given index
		
		System.out.println(list.get(3)); // 50
		System.out.println(list.get(1)); // 30
		
		
	//size(); returns the total number of elements in the list (similar with length())
		System.out.println(list.size());
		//last index number: list.size()-1
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for(int i=list.size()-1; i >=0; i--) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	//clear(): removes all objects from arrayList
		list.clear();
		System.out.println(list);
		
		
	//set(index, object): replaces the index with the given object
		ArrayList<String> students = new ArrayList<>();
		students.add("Erhan");
		students.add("Homayra");
		students.add("Rahwa");
		students.add("Arzu");
		students.add("Mehmet");
		students.add("Rahwa");
		System.out.println(students);
		
		students.set(0, "Holly");
		System.out.println(students);
		
		students.set(4, "Happy bday Mehmet");
		System.out.println(students);
		
	//indexOf(object): returns the first matching object's index number
		System.out.println(students.indexOf("Rahwa"));
		
	//lastIndexOf(object): returns the last matching object's index numbr
		System.out.println(students.lastIndexOf("Rahwa"));
		
	//equals(); returns boolean expression, compare arrays
		ArrayList<String> students2 = new ArrayList<>(Arrays.asList("a","b","c"));
		
		System.out.println(students.equals(students2));	//false
	
		students2 = students;
		System.out.println(students.equals(students2));	//true
	
	//contains(object): checks if the given object is contained in the ArrayList
		System.out.println(students);
		
		System.out.println(students.contains("Muhtar")); //false
		System.out.println(students.contains("Rahwa")); //true
		
	//isEmpty(): checks if the size of the ArrayList is 0 or not, returns boolean expression
		ArrayList<Character> ch = new ArrayList<>();
		
		System.out.println(ch.isEmpty()); //true
		
		ch.add('Y');
		System.out.println(ch.isEmpty());//false
		
	//remove(primitives int): removes the given index number
		//this is not designrd to be used within the loop
		ArrayList<Integer> price = new ArrayList<>();
		price.add(1); //index 0
		price.add(2); //index 1
		price.add(3); //index 2
		
		price.remove(1); //[1,3]
		
		System.out.println(price);
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,2,3,1));
	
	//removeAll(Interface)	
		num.removeAll(Arrays.asList(1));
		/*	that's why its not designed 
		for(int i=0; i<num.size(); i++) {
			if (num.get(i) ==1) {
				num.remove(i);
			}
		}
		*/
		System.out.println(num);
		
	//addAll(Interface): adds multiple objects to the Arraylist
		ArrayList<String> n1 = new ArrayList<>();
		n1.addAll(Arrays.asList("Yasin","Talha","Ruslan"));
		System.out.println(n1);
		
		
	//Collections.sort(ArrayList);	sort the arrayList in ascending order
		
		Integer[] arr = {1,2,3,4,5,5,100,-100,9};
		
		ArrayList<Integer> lists = new ArrayList<>(Arrays.asList(arr));
		System.out.println(lists);
		
		Collections.sort(lists);
		System.out.println(lists);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
