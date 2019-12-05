package day43_JavaRecap;

import java.util.Arrays;

public class instanceBlock {
	
	String [] names = new String[3];
	
	{
		names[0] = "Alla";
		names[2] = "Seyfo";
		names[1] = "Khurshed";
		
		
		System.out.println("instance block");//when object will be created, instance block will be executed
	}
	
	public instanceBlock() { //execute last time after instance block
		System.out.println("Constructor");
		names[0] = "Rahwa";
		names[2] = "Gulmila";
		names[1] = "Esma";
		
	}
	
	public static void main(String[] args) {
		
		instanceBlock obj = new instanceBlock();
		
		
		System.out.println(Arrays.toString(obj.names));//instance depends on the creation of object
		
		System.out.println("main method");
		
		instanceBlock obj1 = new instanceBlock();//instance and constructor will execute how many times we will create obj
		
		int a=10;
		a=20;
		System.out.println(a);
		
	}
	
	
	
	
	

}
