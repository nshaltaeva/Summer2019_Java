package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Acsending {
	
	public static void main(String[] args) {
		
	
		int [] arr = {7,6,5,4,3,2};
		
		arr = Sort(arr);
		System.out.println(Arrays.toString(arr));
		
		   int[]array={9,8,7};
	        array=Sort(array);
	        System.out.println(Arrays.toString(array));
	}
	
	public static int[] Sort(int[] a) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int each: a)
		list.add(each);
		for(int i=0; i < a.length; i++) {
		a[i] = findMin(list);
		list.remove(Integer.valueOf(a[i]));
		}
		return a;
		}
	
	

		public static int findMin(ArrayList<Integer> a) {
		int min =Integer.MAX_VALUE;
		for(int each: a)
			min = each;
	//	min = Math.min(min, each);
		return min;
		}
		

}
