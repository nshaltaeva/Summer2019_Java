package day41_initializerBlocks;

public class InstanceBlock {
	
	{
		System.out.println("instance block");
	}
	
	public InstanceBlock() {
		System.out.println("constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		
		InstanceBlock obj = new InstanceBlock();
		InstanceBlock obj1 = new InstanceBlock();
		InstanceBlock obj2 = new InstanceBlock();
	}

}
