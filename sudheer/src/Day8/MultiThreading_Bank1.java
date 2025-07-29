package Day8;

class Bank2Ex {
    private double balance;

    public Bank2Ex(double balance) {
        this.balance = balance;
    }

    synchronized void deposit(double amount) {
        if (balance >= 0) {
            balance += amount;
            System.out.printf("%s deposited: %.2f, Balance: %.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        }
    }

    synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("%s withdrew: %.2f, Balance: %.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        } else {
            System.out.printf("%s: Insufficient funds for withdrawing %.2f, Balance: %.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class MultiThreading_Bank1 {

    public static void main(String[] args) throws InterruptedException {
        Bank2Ex account = new Bank2Ex(10000.00f);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.deposit(200.0);
                sleep(100);
            }
        }, "Deposit-Thread");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(150.0);
                sleep(120);
            }
        }, "Withdraw-Thread");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.printf("Final Balance = %.2f%n", account.getBalance());
    }

    static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
        }
    }
}
