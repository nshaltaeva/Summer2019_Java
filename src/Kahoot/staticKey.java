package Kahoot;

public class staticKey {
	static int a;
	long  b = 100; //200, 175
	
 public	static String name = "Nuri";
	
	public staticKey() {
		b -= 50; //
	}
	public staticKey(int b) {
		this(); //third execute total = 200-50
		
		this.b += b; // total += 25 = ==> 150+25 = 175
	}
	{
		b *= 2; //second execute this 100*2 =200
	}
	static { //first will execute
		int b = 20; //local didnt affect instance variable
		b /= 2;
	}
	
	public static void main(String[] args) {
		staticKey obj1 = new staticKey(25);
	//	obj1.b = 10;
	//	obj1.a = 20;
		
	//	staticKey obj2 = new staticKey();
	//	obj2.b = 30;
	//	obj2.a = 40;
		
		System.out.println(obj1.b);
	//	System.out.println(ID);
	}
	

}
