package day50_Abstraction_Recap;

public class Dog extends Animal{
	
	public Dog(char gender, byte age, String color, String nickname) {
		super(gender, age, color, nickname);
	}
	
	
	public  void Speak(String language) {
		System.out.println(nickname+" speaks "+language);		
		};
		public  void Eat(String food) {
		System.out.println(nickname+" eats "+food);	
			
		};
		public  void Sleep(int hours) {
			System.out.println(nickname+" sleeps "+hours+" hours");
		};
		public  void Drink(String drinks) {
			System.out.println(nickname+" drinks "+drinks);
		};



}
