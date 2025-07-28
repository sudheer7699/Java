package Day6;

interface Account{
	void showbalance(); // must override in class
	default void accountType() { // optional to override
		System.out.println("Account type is Generic");
	}
	static void bankRules() {
		System.out.println("w minimum balance should maintain $3000");
	}
}

interface Transaction{
	void deposit(double amount);
	void withdraw(double amount);
	default void transactionFee(){
		System.out.println(" 10 per transaction ");
	}
}

class BankPerson implements Account, Transaction{
	
	private double balance;
	

	public BankPerson(double intialBalance) {
		super();
		this.balance = intialBalance;
	}


	@Override
	public void showbalance() {
		System.out.println("present balance :"+balance);
		
	}

	@Override
	public void deposit(double amount) {
		balance = balance +amount;
		System.out.println("deposit Successful");
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance = balance-amount;
			System.out.println("withdraw successful");
		}else {
			System.out.println("invalid amount");
		}
		
	}
	
}

class Banking{
	public static void main(String[] args) {
		BankPerson bp = new BankPerson(19000);
		bp.showbalance();
		bp.accountType();
		bp.transactionFee();
		bp.deposit(20000);
		bp.withdraw(1000);
		bp.showbalance();
		Account.bankRules(); // static methods we have to call with interface name;
		
	}
}