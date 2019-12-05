package Kahoot;

import java.util.Arrays;

public class first {
	public static void main(String[] args) {
		//5
		int []num1 = new int[3];
		int []num2 = {1,2,3,4,5};
		num1=num2;
		for(int i=0; i<num1.length;i++) {
			System.out.print(num1[i]+" ");
		}
		System.out.println();
		
		for(int each: num1) {
			System.out.print(each+" ");
		}
		System.out.println();
		
		//6
		int nums[];
		nums =new int[2];
		nums[0] =10; //[10,0]
		nums[1]=20; //[10,20]
		
		nums = new int[4]; //[0,0,0,0]
		//after reinitialize array size, every value will be erased
		
		nums[2]=30;//[0,0,30,0]
		nums[3]=40;//[0,0,30,40]
		System.out.println(Arrays.toString(nums));
		
		int [] intArr = {15,30,45,60,75};
		intArr[2] = intArr[4];
		intArr[4]=90;
		System.out.println(Arrays.toString(intArr));
		
		int arr[]= {1,2,3,4};
		int i =0;
		do {
			System.out.println(arr[i]+" ");
			i++;
		}while(i<arr.length-1);
		
		System.out.println("======");
		
		
		//4
		
		String [] days = {"sun","mon","wed","sat"};
		int wd=0;//1) sun ==> 0-1=-1; 2) mon ==> -1+1+2 = 2; 3) wed ==> 2+2 = 4; 4) sat/sun ==> 4-1=3 
		for(int j=0;j<days.length;j++) {//i:0,1,2,3
			switch (days[j]) {
			case "sat": //"back to back sat and sun" == "|| logic"
			case "sun": //sun ==> 
				wd -= 1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd+=2;
			}
		}
		System.out.println(wd);
		
		System.out.println("=======");
		
		char[] array = {'D','C','A','B'};
		Arrays.sort(array);
		for(char each: array) {
			System.out.println(each+" ");
			if (each=='D') {
				continue;
			}
		}
		
		
		
		//10
		int [] MyArr = {10,20,30,40};
		int o=0;//with iterator
		// 1) 1; 2) 2; 3) 3
		int count=0;
		for(int l=0; l<MyArr.length;l++) {
			if(MyArr[i] == 30) {
				break;
		//		count++;
					
			}
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		do {
			System.out.println(MyArr[o]); //10 20 30 stop
			o++; 
		}while(o<MyArr.length-1);
		//         o < 3
		//         1<3
		//         2<3
		//         3<3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
