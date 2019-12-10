package day62_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	
	public static void main(String[] args) {
		Set<Integer> st1 = new HashSet<>();//doesn't take duplicates, doesn't have index number
		st1.add(100);
		st1.add(100);
		st1.add(100);
//		st1.get(0);// doesn't have index number
		System.out.println(st1);//[100], not [100,100,100]
		
		System.out.println("===============================");
		
		Set<Integer> hashset = new HashSet<>();
		hashset.add(100);
		hashset.add(10);
		hashset.add(5);
		hashset.add(4);
		hashset.add(3);
		hashset.add(1);
		System.out.println(hashset);// HashSet does not keep the objects order as it is
		
		System.out.println("===============================");
		
		Set<Integer> linkedhashset = new LinkedHashSet<>();
		
		linkedhashset.add(100);
		linkedhashset.add(10);
		linkedhashset.add(5);
		linkedhashset.add(4);
		linkedhashset.add(3);
		linkedhashset.add(1);
		System.out.println(linkedhashset);
		// LinkedHashSet keeps the order as it is 
        // doubly-linked: add() & remove() are faster than HashSet
		
		
		System.out.println("===============================");
		
		Set<String> treeset = new TreeSet<>();
		treeset.add("Z");
		treeset.add("Y");
		treeset.add("X");
		treeset.add("W");
		treeset.add("V");
		System.out.println(treeset);
		
		System.out.println("===============================");
		
		
		System.out.println("===============str================");
		
		String str = "AAAABBBBCCCCDDDD";
		String [] arr = str.split("");
		
		System.out.println(Arrays.toString(arr));
		
		TreeSet<String> RemoveDup = new TreeSet<>(Arrays.asList(arr));
		String result = RemoveDup.toString().replace("[", "").replace("]", "").replace(", ", " ");
		System.out.println(RemoveDup);//converts to String from array
		System.out.println(result);
		
		System.out.println("===============str1================");
		
		
		String str1 = "ZZZYYYXXXAAAABBBBCCCCDDDD";
		String [] arr1 = str1.split("");
		
		System.out.println(Arrays.toString(arr1));
		
	//	TreeSet<String> RemoveDup1 = new TreeSet<>(Arrays.asList(arr1));
		LinkedHashSet<String> RemoveDup1 = new LinkedHashSet<>(Arrays.asList(arr1));
		String result1 = RemoveDup1.toString().replace("[", "").replace("]", "").replace(", ", " ");
		System.out.println(RemoveDup1);//converts to String from array
		System.out.println(result1);
		
		System.out.println("===============str2================");
		
		//second solution
		String str2 = new LinkedHashSet<String>(Arrays.asList(arr1)).toString().replace("[", "").replace("]", "").replace(", ", " ");
		System.out.println(str2);
		System.out.println("===============================");
	}
	
		
	
	
}
