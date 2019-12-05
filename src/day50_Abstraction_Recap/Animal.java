package day50_Abstraction_Recap;
/*
  create an Animal abstract class
  	data/attributes: gender, age, color, name
  	
  	create one constructor that can set the gender, name, color and age
  	
  	Actions: Speak(), Eat(), Sleep(), Drink();
  	
  	create sub classes of Animal and override those actions:
  			
  	dog: Speak() ==> woof, Eat() ==> KFC, Sleep() ==> 8 hours, Drink() ==> Milk Shake;
  	cat: Speak() ==> meow, Eat() ==> M&M, Sleep() ==> 14 hours, Drink() ==> Hot Chocolate;
  	cow: Speak() ==> moo, Eat() ==> hot pot, Sleep() ==> 5 hours, Drink() ==> Coffee;
  	
  	create  zoo class and store some of those animals' objects

 */

	
	
public abstract class Animal {
	
	public char gender;
	public byte age;
	public String color;
	public String nickname;
	
	public Animal(char gender, byte age, String color, String nickname) {
		this.gender = gender;
		this.age = age;
		this.color = color;
		this.nickname = nickname;
	}
	
	public abstract void Speak(String language);
	public abstract void Eat(String food);
	public abstract void Sleep(int hours);
	public abstract void Drink(String drinks);
	

	public void getInfo() {
		System.out.println("==================================");
		System.out.println("Nickname is "+nickname);
		System.out.println("Gender is "+gender);
		System.out.println("Color is "+color);
		System.out.println("Age is "+age);
		System.out.println("==================================");
	}
}


