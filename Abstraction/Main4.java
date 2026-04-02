abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount; // overdraft allowed
        System.out.println("Withdrawn (Overdraft allowed): " + amount);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount(1000);
        Account acc2 = new CurrentAccount(1000);

        acc1.deposit(500);
        acc1.withdraw(2000); // should fail

        acc2.deposit(500);
        acc2.withdraw(2000); // allowed

        System.out.println("Savings Balance: " + acc1.balance);
        System.out.println("Current Balance: " + acc2.balance);
    }
}