package day53_Interface_Continue;

public class Jeep_Wrangler implements Cars, GasVehicles{
	@Override
	public void Start() {
		System.out.println("Call Mechanic");
		System.out.println("Oil change");
		System.out.println("Jump Start");
	}
	
	@Override
	public void PumpGas() {
		System.out.println("Pumping Cas");
	}

	@Override
	public void SelfParking() {
		// TODO Auto-generated method stub
		System.out.println("Self parking mode");
	}
}
