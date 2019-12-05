package day39_JavaReview;

public class CellPhone {
	
	String brand;
	double price;
	String color;
	double screensize;
	String model;
	
	public CellPhone(String brand,	double price, String color,	double screensize,	String model) {
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.price = price;
		this.screensize = screensize;
				
	}
	
	public CellPhone() {
		brand = "iPhone";
		model = "10";
		screensize=5.8;
		color = "red";
		price = 700;
	}
	
	
	
	public void call(long phoneNum) {
		System.out.println(brand+" "+model+" is calling "+phoneNum);
	}
	
	public void SendMessage(long phoneNum) {
		System.out.println("Sending message to "+phoneNum);
	}
	
	public void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+screensize+" "+price);
	}

}
