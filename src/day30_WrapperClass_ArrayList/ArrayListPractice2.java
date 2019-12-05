package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice2 {
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
	
	for(int i=0; i <= 30; i++) {
		if (i%2 != 0)		{
		continue;
		}
		list.add(i);
	}
	
	System.out.println(list);
	
	System.out.println(list.size());
	
	System.out.println(list.get(4));
	
	//1
	for(int i=0; i<list.size(); i++) {
		System.out.print(list.get(i)+" ");
	}
	System.out.println();
	
	//2
	for (int each: list) { //unboxing, because list is Integer
		System.out.print(each+" ");
	}
	System.out.println();
	//list.clear();//the size of list becomes 0: []
	
//	System.out.println(list.get(2));//out of bound
	
	//sorting the ArrayList
	Collections.sort(list);
	
	
	ArrayList<Integer> list2 = new ArrayList<>();
	
	for(int i=20; i>=0; i--) {
		list2.add(i);
	}
	System.out.println(list2);
	
	Collections.sort(list2);
	System.out.println(list2);
	
}
}
