package ReplIt;

import java.util.ArrayList;
import java.util.Arrays;

public class Method_CombineAl {
	
	public static void main(String[] args) {
		ArrayList<String> list  = new ArrayList<>(Arrays.asList("a","b","c"));
		ArrayList<String> list2  = new ArrayList<>(Arrays.asList("d","e","f"));
		
		System.out.println(combineAL(list, list2));
	}
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {

		
		wordList1.addAll(wordList2);
		return wordList1;
	}

}
