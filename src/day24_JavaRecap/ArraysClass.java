package day24_JavaRecap;

public class ArraysClass {
	public static void main(String[] args) {
		
		char[] myNum = new char[5];
		for(int i=0; i<myNum.length; i++) {
			System.out.println(myNum[i]);
		}
		System.out.println("========");
		
		
		//in order to assign values 
		int ch[] = new int[3];
		ch[0] = 10;
		ch[1] = 20;
		ch[2] = 30;
		
		
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//reinitialize size
				ch = new int[4];
				//
				for(int i=0; i<ch.length; i++) {
					System.out.print(ch[i]);
				}
				System.out.println();
		int[] array1 = {1,2,3};
		int[] array2 = {4,5,6};
		
		int[] array3 = new int[array1.length + array2.length];
		//array3 has enough capacity to contain array1 and array2 elements
		
		for(int i=0; i<array1.length; i++) {
			array3[i] = array1[i];
		}
//to combine two arrays
		for(int i=0; i<array2.length; i++) {
			array3[i+array1.length] = array2[i];
		}
			
				
		for (int i=0; i<array3.length; i++) {
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
