package OfficeHour;

public class Array {
	public static void main(String[] args) {
		
		
		int [] num = {4,3,2};
		for(int Dnums: num) {
			System.out.print(Dnums*2 + " ");
		}
		System.out.println();
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]*2 + " ");
		}
		System.out.println();
		System.out.println(num[0]+num[1]);
		
		
		int [][] nums = {{10,20,30},{40,50,60},{70,80}};
		
		for(int [] numArr: nums) {
			for(int numbers: numArr) {
				System.out.print(numbers+" ");
			}
		}
		System.out.println();
		
		
		//5 days, jump 10 times
		
		for(int day=1; day <=5; day++) {
			System.out.println("day"+ day);
			for(int jump=1; jump <=10; jump++) {
				System.out.print("jumping "+jump+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
