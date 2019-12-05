package day43_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlock {

	static String [] arr = new String[3];
	static ArrayList<String> list = new ArrayList<>();
	double salary;
	
	static {
		System.out.println("static block");
		
		arr[2] = "Alla";
		arr[0] = "Katya";
		arr[1] = "Ruslan";
		
		list.addAll(Arrays.asList(arr));
	//	System.out.println(Arrays.toString(arr));
	//	System.out.println(list);
		
	//	salary = 5000; //static only accepts static
		
		staticBlock obj1 = new staticBlock(); //obj is local within the static block we cannot use outside the block
		obj1.salary = 4000;
		System.out.println(obj1.salary);
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		staticBlock obj1 = new staticBlock();//two different obj1
		System.out.println(obj1.salary);//that's why 0.0
		
		
		
		
		
		
		
	}
	
	
	
	
}
