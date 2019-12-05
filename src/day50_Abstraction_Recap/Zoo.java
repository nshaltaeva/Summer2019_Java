package day50_Abstraction_Recap;

public class Zoo {
	
	public static void main(String[] args) {
		Cat Murka = new Cat('F', (byte)5, "White & Black", "Murka");
		
		Murka.getInfo();
		Murka.Drink("hot chocolate");
		Murka.Eat("popcorn");
		Murka.Sleep(15);
		Murka.Speak("Meow");
		
		Dog Tuzik = new Dog('M', (byte)12, "Black", "Tuzik");
		
		Tuzik.getInfo();
		Tuzik.Speak("Kyrgyz Woof");
		Tuzik.Sleep(8);
		Tuzik.Drink("water");
		Tuzik.Eat("bones");
		
		Dog Pongo = new Dog('M', (byte)12, "Black", "Pongo");
		
		Pongo.getInfo();
		Pongo.Speak("Kyrgyz Woof");
		Pongo.Sleep(8);
		Pongo.Drink("water");
		Pongo.Eat("bones");
		
		Dog [] dog = {Pongo, Tuzik};
		
		
		
		Cow Burenka = new Cow('F', (byte)15, "red", "Burenka");
		
		Burenka.getInfo();
		Burenka.Speak("moooo");
		Burenka.Eat("grass");
		Burenka.Drink("water");
		Burenka.Sleep(12);
		
		Cow Mumu_ka = new Cow('F', (byte)8, "Brown & White", "Mumu_ka");
		Mumu_ka.getInfo();
		Mumu_ka.Speak("moo-moo");
		Mumu_ka.Eat("grass and hot pot");
		Mumu_ka.Drink("water and juice");
		Mumu_ka.Sleep(16);
		
		dog[1].getInfo();
	}

}
