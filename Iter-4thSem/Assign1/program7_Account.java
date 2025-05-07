package Proj1;

abstract class Account {
    private int accno;
    private double balance;

    public Account(int accno, double balance) {
        this.accno = accno;
        this.setBalance(balance);
    }

    public int getaccno() {
        return accno;
    }

    public double getbalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accno, double balance, double interestRate) {
        super(accno, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        setBalance(getbalance() + (amount + interest));
    }

    @Override
    public void withdraw(double amount) {
        if (getbalance() >= amount) {
            setBalance(getbalance() - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getbalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getbalance() + overdraftLimit >= amount) {
            setBalance(getbalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

public class program7_Account {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(101, 1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(102, 2000, 500);

        savingsAccount.deposit(1000);
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getaccno());
        System.out.println("Balance: " + savingsAccount.getbalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");

        savingsAccount.withdraw(3000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(500);
        System.out.println("Current Account Details:");
        System.out.println("Account Number: " + currentAccount.getaccno());
        System.out.println("Balance: " + currentAccount.getbalance());
        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
    }
}