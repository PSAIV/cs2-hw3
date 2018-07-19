//Utilizing the Account class, runs a simulated ATM perpetually.
import java.util.Scanner;

public class MyATM {
	
	public static void main(String args[]) {
		
		Account[] accounts = new Account[10];
		
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		int userId = getId();
		menu(userId, accounts);
	}
	
	public static int getId() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an account id: ");
		int id = s.nextInt();
		while(id < 0 || id > 10){
			System.out.print("\nInvalid id, please try again: ");
			id = s.nextInt();
		}
		return id;
	}
	
	public static void menu(int id, Account[] accounts) {
		Scanner s = new Scanner(System.in);
		System.out.print("1. View current balance\n2. Withdraw\n3. Deposit\n4. Exit\n\n");
		int choice = s.nextInt();
		if(choice == 1) {
			System.out.println("Current balance: $" + accounts[id].getBalance());
			menu(id, accounts);
		}
		if(choice == 2) {
			double withdrawal;
			System.out.print("Withdrawal amount: ");
			withdrawal = s.nextDouble();
			accounts[id].withdraw(withdrawal);
			System.out.print("\nWithdrew $" + withdrawal);
			System.out.println("\nNew balance: $" + accounts[id].getBalance());
			menu(id, accounts);
		}
		if(choice == 3) {
			double deposit;
			System.out.print("Deposit amount: ");
			deposit = s.nextDouble();
			accounts[id].deposit(deposit);
			System.out.print("\nDeposited $" + deposit);
			System.out.println("\nNew balance: $" + accounts[id].getBalance());
			menu(id, accounts);
		}
		if(choice == 4) {
			System.out.println("Exitting account #" + id);
			int userId = getId();
			menu(userId, accounts);
		}
		
	}

}
