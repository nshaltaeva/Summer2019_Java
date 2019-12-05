package day53_Interface_Continue;

public class Toyota_Hybrid implements Cars, ElectricVehicles, GasVehicles{

	@Override
	public void PumpGas() {
		// TODO Auto-generated method stub
		System.out.println("Pumping Gas");
	}

	@Override
	public void Charge() {
		// TODO Auto-generated method stub
		System.out.println("Charging");
	}

	@Override
	public void SelfDrive() {
		// TODO Auto-generated method stub
		System.out.println("Self Driving Mode");
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Push start button");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("Toyota is flying");
	}

	@Override
	public void SelfParking() {
		// TODO Auto-generated method stub
		System.out.println("Self parking mode");
	}
	
	

}
