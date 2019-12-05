package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		System.out.println(arr);
		
		/*
 To print entire array as whole, we need to convert the array to String
		 Arrays.toString(VaruableNAme): used for converting single
		 dimensional arrays to String value
		 
		 Arrays class 
		 
		
		 */
		
		
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		String [] names = {"Elvira", "Bibish", "Tural", "Daulet", "Hakan"};
		
		System.out.println(names[0]);
		System.out.println(names);//hash code
		
		System.out.println(Arrays.toString(names));
		
		/*
		 Arrays.sort(varuableName):
		 sorts the values of the array in ascending order(smallest to biggest)
		 */
		
		int [] Num = {9,8,100,3000,4,5,6};
		System.out.println(Arrays.toString(Num));
		Arrays.sort(Num);
		System.out.println(Arrays.toString(Num));
		
		
		System.out.println("Maximum num: "+Num[Num.length-1]);
		System.out.println("Minimum num: "+Num[0]);
		
		
		String [] NameList= {"Elbars", "Nailia", "Elman","Neya"};
	//	System.out.println(Arrays.toString(Num));
		Arrays.sort(NameList);
		System.out.println(Arrays.toString(NameList));
		
		
		char[] ch = {'0','9','8','5','3'};
		
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		
		/*
		 write a program that will print descending order
		 */
		int [] num = {1,2,3,5,6,7};
		
		  int  [] newnum=new int[num.length];
	      for(int i=0;i<num.length;i++) {
	          newnum[i]=num[(num.length-1)-i];
	      }System.out.println(Arrays.toString(newnum));
	
	
	//1 way
	int [] MyNums = {99,33,600,50,1};
	
	Arrays.sort(MyNums);
	// MyNums -> [1, 33, 50, 99, 600]
	//index       0   1   2   3   4
	System.out.println(Arrays.toString(MyNums));
	String brace = "[";
	for(int i = MyNums.length-1; i >= 0; i--) {
		brace += MyNums[i]+", ";
	}
	brace = brace.substring(0, brace.length()-2)+"]";
	
	System.out.println(brace);
	System.out.println();
	
	
	//2 way
	
	int [] arr2 = {99,100,200,30,60,9};
	Arrays.sort(arr2);
	//array will be [9, 30, 60, 99, 100, 200]
	//index          0   1   2   3    4   5
	int [] decending = new int[arr2.length];
	/*
	decending[0] = arr2[5];
	decending[1] = arr2[4];
	decending[2] = arr2[3];
	decending[3] = arr2[2];
	decending[4] = arr2[1];
	decending[5] = arr2[0];
	*/
	int z=0;
	for (int i=arr2.length-1; i>=0; i--) {
		decending[z] = arr2[i];
		z++;
	}
	
	System.out.println("Ascending order: "+Arrays.toString(arr2));
	System.out.println("Descending order: "+Arrays.toString(decending));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
}
	


