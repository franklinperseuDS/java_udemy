package entities;

public class BankAccount {
    private int number;
    private String holder;
    private double balance;

    public BankAccount () {
    }

    public BankAccount (int number, String holder) {
        this.holder = holder;
        this.number = number;
    }

    public BankAccount (int number, String holder, double balance) {
        this.holder = holder;
        this.number = number;
        deposit(balance);
    }

    public void deposit (double value) {
        this.balance += value;
    }

    public void withdraw (double value) {
        this.balance -= value + 5.00;
    }

    public String getHolder () {
        return this.holder;
    }

    public void setHolder (String holder) {
        this.holder = holder;
    }

    public int getNumber () {
        return this.number;
    }

    public double getBalance () {
        return this.balance;
    }

    public String toString() {
        return "Account "+ this.number
                +", Holder: "+ this.holder
                +", Balance: $ " +String.format("%.2f",getBalance());
    }
}
