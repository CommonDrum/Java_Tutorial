package Day22_09.Accounts;

public class VIPAccount extends Account {

    protected double specialInterest;
    protected double debitLimit;

    VIPAccount(Person owner, double balance) {
        super(owner, balance);
    }

    @Override
    public boolean withdraw(double withdrawalAmount) {

        if (withdrawalAmount >= balance + debitLimit) {
            balance -= withdrawalAmount;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean transfer(Bill receiver, double transferAmount) {

        if (transferAmount >= balance + debitLimit) {
            this.withdraw(transferAmount);
            receiver.deposit(transferAmount);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void setInterest(double interest) {
        this.specialInterest = interest;
    }

    @Override
    public void update() {
        if (balance > 0) {
            balance = balance * specialInterest;
        }
    }

    @Override
    public String toString() {
        return "Owner " + owner.toString() + " Balance: " + balance + " Account Interest: " + specialInterest;
    }


}
