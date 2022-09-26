class Account {
    private double balance = 1000;

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amountToDeposit) {
        System.out.println("Current Thread : " + Thread.currentThread().getName() + " Balance : " + balance);
        double updatebalance = balance + amountToDeposit;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        balance = updatebalance;
    }
}

class AddAmount implements Runnable {
    Account acct;

    // Defining constructor
    AddAmount(Account ac) {
        acct = ac;
    }

    // Creating run method
    public void run() {
        acct.deposit(1000);
    }
}

public class sync {
    public static void main(String[] args) {
        Account a1 = new Account();
        AddAmount t = new AddAmount(a1);

        Thread T1 = new Thread(t);
        Thread T2 = new Thread(t);
        Thread T3 = new Thread(t);

        T1.start();
        T2.start();
        T3.start();

        try {
            T1.join();
            T2.join();
            T3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("final Balance : " + a1.getBalance());

    }
}
