package day38_CustomClass_continue;

public class BankAccount {
	/*
	 create a custom class for BankAccount
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: deposit, withdraw, showBalance
        requirements: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance
	 */
//	instance variable: declared in the class, outside of method
		String AccountHolder;
		long AccountNumber;
		double Balance;
		
		
		
		
		public BankAccount() {
			
		}
		
		
		
	/*	public BankAccount(String name, long accountNum) {
			AccountHolder = name;
			AccountNumber = accountNum;
		}
		*/
		
		
		//keyword this. 
		
		public BankAccount(String AccountHolder, long AccountNumber) {
			this.AccountHolder = AccountHolder;
			this.AccountNumber = AccountNumber;
		}
		
		
		
		
		
		
		public void ShowBalance() {
			System.out.println("----------------------------------------");
			String accountN = ""+AccountNumber;
			String xx = "************"+accountN.substring(12);
			System.out.println("Account Holder: "+AccountHolder);
			System.out.println("Account Number: "+xx);
			System.out.println("Available Balance: $"+Balance);
			System.out.println("----------------------------------------");
			
		}
		
		
		public void Deposit(double amount) {
			System.out.println("----------------------------------------");
			String accountN = ""+AccountNumber;
			String xx = "************"+accountN.substring(12);
			System.out.println("Depositing "+amount+" to the account "+xx);
			Balance += amount;
			System.out.println("New balance: $"+Balance);
			System.out.println("----------------------------------------");
		}
		
		
		public void Withdraw (double amount) {
			System.out.println("----------------------------------------");
			
			if(Balance <= 0) {
				System.out.println("No available balance");
				return; //exits the method Withdraw()
			}
			
			String accountN = ""+AccountNumber;
			String xx = "************"+accountN.substring(12);
			System.out.println("Withdrawing "+amount+" from the account "+xx);
			Balance -= amount;
			
			
			if(Balance < 0) {
				Balance -= 35;
				
			}
			System.out.println("New balance: $"+Balance);
			System.out.println("----------------------------------------");
		}
		
		
		public void accountSetUp(String name, long accountNum) {
			AccountHolder = name;
			AccountNumber = accountNum;
		}
		
		
		
		
		
}
