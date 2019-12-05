package day53_Interface_Continue;

public class Tesla_Model3 implements Cars, ElectricVehicles{
	
	@Override
	public void Start() {
		System.out.println("Tesla Voice control \"Tesla Start\" ");
	}
	
	@Override
	public void Charge() {
		System.out.println("Tesla is charging");
	}
	
	@Override
	public void SelfDrive() {
		System.out.println("Tesla is in selfdriving mode");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("Tesla is flying");
	}

}
