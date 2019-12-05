package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RemoveAhmed {
	
	public static void main(String[] args) {
		// Solution 1:
				 ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
				 names.removeAll( Arrays.asList("Ahmed"));
				 System.out.println(names);
				 
				 
		//Solution 2:

					 List<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

					 for(ListIterator<String> it=names1.listIterator(); it.hasNext();)

					         if(it.next().equals("Ahmed"))

					             it.remove();
					 System.out.println(names1); 
				 
				 
				 
				 
	}
	

}
