package day53_Interface_Continue;

public class DealerShip {
		public static void main(String[] args) {
			
			Tesla_Model3 obj1= new Tesla_Model3();
			obj1.Start();
			obj1.Charge();
			obj1.Fly();
			obj1.SelfDrive();
			
			System.out.println("===================================");
			Toyota_Hybrid obj2 = new Toyota_Hybrid();
			obj2.Start();
			obj2.PumpGas();
			obj2.SelfDrive();
			
			System.out.println("===================================");
			Jeep_Wrangler obj3 = new Jeep_Wrangler();
			obj3.Start();
			obj3.SelfParking();
			obj3.PumpGas();
			
			
			
			
		}
}
