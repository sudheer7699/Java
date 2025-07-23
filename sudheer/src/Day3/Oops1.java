package Day3;

public class Oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("Sunny", 1000);
		account.deposit(500);
		account.withdraw(300);
		account.displayDetails();
	}

}
