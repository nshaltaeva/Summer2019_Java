package day28_JavaRecap;

import java.util.Arrays;

public class WarmUp1 {
	/*
	warm Up:  
	    1. write a method that can convert km to miles
	    
	    1 km = 0.612 ml
	    	    
	    2. write a method that can convert gallons to litters
	    
	    1 gallon = 3.75 l
	    
	   3. write a method that can print out the array in Descending order
*/
	public static void main(String[] args) {
	//	KmToMiles();//not enough info for method to perform its task
		KmToMiles(100);//KmToMiles(10.0);
		GalToLit(9);
		int [] array = {0,-1,1000,2000,5000};
		SortDescending(array);
	}
	
	public static void KmToMiles(double km) {
		double miles = km*0.612;
		System.out.println(km+ " km equals to "+miles+" miles");
	}
	
	public static void GalToLit(double gal) {
		double lit = gal*3.75;
		System.out.println(gal+ " gal equals to "+lit+" liters");
	}
	
	public static void SortDescending (int [] array) {
		
		//array ={10,8,99,0,-1}
		
		Arrays.sort(array);
		
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
		
		
	}
	
	
	
}
