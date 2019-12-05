package day48_MethodOverriding;

public class Bank {
	
	public void InterestRate() {
		System.out.println("9%");
	}

	public static void main(String[] args) {
		BankOfAmerica BOA = new BankOfAmerica();
		BOA.InterestRate();
		
		Chase chase = new Chase();
		chase.InterestRate();
		
		CapitalOne CapOne = new CapitalOne();
		CapOne.InterestRate();
	}
}
	
	class BankOfAmerica extends Bank{
		
		@Override
		public void InterestRate() {
			System.out.println("7%");
		}
		
	//	@Override this method is not overrided method from super class
	//	public void print() {	}
	}
	
	
	class Chase extends Bank{
		@Override
		public void InterestRate() {
			System.out.println("6%");
		}
	}
	
	class CapitalOne extends Bank{
		@Override
		public void InterestRate() {
			System.out.println("8%");
		}
	}

