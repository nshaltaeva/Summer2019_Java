package ReplIt;
import java.util.ArrayList;
import java.util.Arrays;

public class Method_RepeatAl {
	public static void main(String[] args) {
		
		ArrayList<Boolean> al = new ArrayList<Boolean>(Arrays.asList(true,false,false));
		repeatAl(al);
		System.out.println(al);
	}

	public static void repeatAl(ArrayList<Boolean> repeated){
		int fixedSize = repeated.size();
		
		for (int i=0; i < fixedSize; i++) {
			repeated.add(repeated.get(i));
		}
		
		
		
		
		
	}
}
