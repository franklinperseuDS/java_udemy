package entities;

public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if( loanLimit >= amount) {
            balance += amount -  10.0;
        }
    }
}
