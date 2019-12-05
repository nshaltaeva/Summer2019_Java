package day38_CustomClass_continue;



public class BankAccountObjects {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		account1.AccountHolder = "Erhan Holy";
		account1.AccountNumber = 1234567891234567L;
		
		account1.ShowBalance();
		
		account1.Deposit(2000);
		account1.Deposit(4000);
		
		account1.Withdraw(3000);
		
		account1.Withdraw(3001);
		account1.Withdraw(3001);
		
		BankAccount account2 = new BankAccount();
		account2.accountSetUp("Nurzat Sha", 1234567899876543L);
		account2.ShowBalance();
		account2.Deposit(1000000);
		account2.Withdraw(500000);
		account2.Withdraw(500002);
		
		
		BankAccount account3 = new BankAccount("Nadire Pilott", 2345678998765432L);
		account3.ShowBalance();
		
		account3.Deposit(10);
		account3.Withdraw(20);
		
		account3.Withdraw(10);
		account3.Deposit(3000);
		
		
		
	}

}
