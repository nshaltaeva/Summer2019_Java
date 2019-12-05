package day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
	public static void main(String[] args) {
		
		BankAccount Sarah = new BankAccount();
		Sarah.setAccountHolder("Sarah");
		Sarah.setAccountNumber(1234567899876l);
		
		
		System.out.println("Name: "+Sarah.getAccountHolder());
		System.out.println("Account number: "+Sarah.getAccountNumber());
		System.out.println("Available balance: "+Sarah.getAvailableBalance());
		
		Sarah.deposit(2000);
		Sarah.ShowBalance();
		
		Sarah.withdraw(2500);
		Sarah.ShowBalance();
		
		Sarah.deposit(10000);
		Sarah.ShowBalance();
		System.out.println("=====================================");
		
		BankAccount Serkan = new BankAccount();
		Serkan.setAccountHolder("Serkan");
		Serkan.setAccountNumber(98765422441l);
		
		Serkan.getAccountInfo();
		
		Serkan.deposit(10000);
		Serkan.ShowBalance();
		Serkan.withdraw(3000);
		
		Serkan.getAccountInfo();
		
		BankAccount[] acoounts = {Sarah, Serkan};
		
		ArrayList<BankAccount> Accounts = new ArrayList<>();
		
		Accounts.add(Sarah);
		Accounts.add(Serkan);
		
		Accounts.addAll(Arrays.asList(Sarah, Serkan));
		
		
		
		
	}

}
