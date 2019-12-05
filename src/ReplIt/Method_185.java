package ReplIt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Method_185 {
	
	public static void main(String[] args) {
		
	//	Scanner scan = new Scanner(System.in);
	/*
		int size = scan.nextInt();
	    String[] words = new String[size];
	    for(int i=0 ;i<words.length;i++)
	    {

	        words[i]=scan.next();
	    }
	   */
		String[] words = {"how", "is", "everyone", "doing?"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
		list.add(0, "hey");
		list.add(3, "yo");
		test(list);	
		
	
	}
	
	
	public static ArrayList<String>  test(ArrayList<String> words)
	{
		//write code here
		ArrayList<String> result = new ArrayList<>();
		for(int i =0; i<words.size();i++) {
			result.add(words.get(i));
			
		}
	//	System.out.println(result);
		return result;
	}

}
