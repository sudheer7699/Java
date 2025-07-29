package Day8;

class BankEx {

	float balance = 5000.00f;
	synchronized void withdraw(float amount) {
	    System.out.println("withdraw started");
	    if(balance < amount) {
	        System.out.println("less balance waiting for deposit");
	        try {
	        	// Wait will pause this thread and release the monitor lock
	            // until another thread calls notify() on the same object
	            wait(); 
	        } catch(InterruptedException e) {
	            System.err.println(e);
	        }
	    }
	 // Once notified, or if balance was already sufficient,
	  // perform the withdrawal
	    balance = balance - amount;
	    System.out.println("withdraw completed :" + balance);
	}

	synchronized void deposit(float amount) {
		System.out.println("Deposit started");
		balance = balance+amount;
		System.out.println("deposit started completed");
		notify();
	}
}
class Customer1 extends Thread{
	BankEx b;
	Customer1(BankEx b){
		this.b = b;
	}
	public void run() {
		b.withdraw(500.00f);
	}
}
class Customer2 extends Thread{
	BankEx b;
	Customer2(BankEx b){
		this.b = b;
	}
	public void run() {
		b.deposit(10000.00f);
	}
}
public class MultiThreading_Bank {
	public static void main(String[] args) {
		BankEx b = new BankEx();
		Customer1 c1 = new Customer1(b);
		c1.start();
		Customer2 c2 = new Customer2(b);
		c2.start();
	}
}