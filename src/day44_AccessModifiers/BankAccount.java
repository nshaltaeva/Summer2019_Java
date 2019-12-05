package day44_AccessModifiers;

public class BankAccount {
	/*
	 WarmUp: create a custom class for bank account
    The attributes/data that the class can have are: 
            AccountHolder, AccountNumber, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    Requirements:
            1. apply encapsulation
            2. user should be able to deposit, withdraw and check the balance
                2.1 if the withdrawing amount is greater than available balance, 35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money
	 */
	
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
//1. Encapsulation	
	//getters
	public String getAccountHolder() {
		return AccountHolder;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public double getAvailableBalance() {
		return AvailableBalance;
	}
		
	//setters
	public void setAccountHolder(String AccountHolder) {
		this.AccountHolder = AccountHolder;
		}
	
	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	public void setAvailableBalance(double AvailableBalance) {
		this.AvailableBalance = AvailableBalance;
	}
	
//2. Actions
	//deposit
	public void deposit(double amount) {
		AvailableBalance  += amount;
	}
	
	//withdraw
	public void withdraw(double amount) {
		
		if(AvailableBalance <= 0) {
			System.out.println("Your account balance is less or equal to 0");
		} else if (amount > AvailableBalance) {
			AvailableBalance -= amount;
			AvailableBalance -= 35;
		} else {
			AvailableBalance -= amount;
		}
		
		/*		
		if(AvailableBalance <= 0 ) {
			System.out.println("Your account balance is less or equal to 0");
			return; //exiting method
		}
		if(amount > AvailableBalance) {
			AvailableBalance -= 35;
		}
		AvailableBalance -= amount;
		*/
	}
	
	//checking balance
	public void ShowBalance() {
		System.out.println("Available balance is "+AvailableBalance);
	}
	
	//get account info
	public void getAccountInfo() {
		System.out.println("Name: "+getAccountHolder());
		System.out.println("Account number: "+getAccountNumber());
		System.out.println("Available balance: "+getAvailableBalance());
	}
	
	
	
}
