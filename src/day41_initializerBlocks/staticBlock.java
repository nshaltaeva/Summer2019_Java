package day41_initializerBlocks;

public class staticBlock {
	
	
	public staticBlock() {
		System.out.println("this is constructor");
	}
		
	static {
		System.out.println("static block2");
		
	}

	public static void main(String[] args) {
		System.out.println("main method");
		
	staticBlock	obj1 = new staticBlock();
	staticBlock	obj2 = new staticBlock();
	}
	
	static {
		System.out.println("static block1");
	}
	
	
}
