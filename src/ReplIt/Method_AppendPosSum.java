package ReplIt;

import java.util.ArrayList;
import java.util.Arrays;

public class Method_AppendPosSum {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> pos = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,-1));
		
		
		System.out.println(appendPosSum(pos));
	}
	//create your method below
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> positive){
		
		
		ArrayList<Integer> newPos = new ArrayList<>();
		
		int sum =0;		
		for(Integer each: positive) {
			
			if(each >= 0) {
				
				newPos.add(each);
				sum += each;
			}
		}
		newPos.add(sum);
		
		return newPos;
	}

}
