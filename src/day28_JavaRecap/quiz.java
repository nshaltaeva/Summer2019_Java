package day28_JavaRecap;

import java.util.Arrays;

public class quiz {
public static void main(String[] args) {
	//1
	char[] ch = {'a','b','c'};
	int z = ch.length;
	int count = 0;
	
	while (count < z-1) {
		count++;
	}System.out.println(count);
	
	//2
	String [] arr = {"Maral", "Nurullah"};
	arr[0] = arr[1];
	arr[1]=arr[0];
	System.out.println(Arrays.toString(arr));
	
	//3
	int num[] = {5,4,3,2,1};
	for(int each: num) {
		if(each == 3) {
			continue;
		}
		System.out.print(each+" ");
	}
	System.out.println();
	
	int num1[] = {5,4,3,2,1};
	for(int each: num) {
		if(each == 3) {
			continue;
		}
		System.out.print(each+" ");
		break;
	}
	System.out.println();
	
	//4
	char[] chars = {'a','b','c'};
	for(char each: chars) {
		
		/*
		 if(each == 'b') //a c
			continue;
		 */
		
		System.out.print(each+" "); // a b c
		if(each == 'b') 
			continue;
	}
	
	System.out.println();
	//5
	
	long [] Array = new long [2]; // [0,0]
	Array[0] = 5L; //[5, 0]
	Array[1] = 10L; //[5,10]
	Array = new long [4]; //[0,0,0,0]
	Array[2] = 15L; //[0,0,15,0]
	Array[3] = 20L; //[0,0,15,20]
	System.out.println(Arrays.toString(Array));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
