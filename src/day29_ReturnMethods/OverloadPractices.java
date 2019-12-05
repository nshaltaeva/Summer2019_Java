package day29_ReturnMethods;

public class OverloadPractices {

	public static void main(String[] args) {
	System.out.println("String array");	
	
	
	boolean [] array1 = {true, false};
	main(array1);
	
	double [] array2 = {1,2,3};
	main(array2);
	
	int [] array3 = {1,2,3};
	main(array3);
	
	}
	
	public static void main(boolean[] args) {//return type does not matter 
		System.out.println("boolean array");	
		}
		
	public static void main(double[] args) {
		System.out.println("double array");	
		}
	
	public static void main(int[] args) {
		System.out.println("int array");	
		}
	
	
	
	
	
	
	
	
	
}
