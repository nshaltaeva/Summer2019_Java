package day49_Abstraction;

abstract class Shape1{
	public abstract void Area();
}


abstract class T extends Shape1{
//	public abstract void Area(); //not visible method in abstract class T
	public void Area() {
		
	}
}

//concrete
class Triangle extends Shape1{
	
	@Override
	public void Area() {
		System.out.println("Area of the triabgle is base*height/2");
	}
}




public class Practice {

}
