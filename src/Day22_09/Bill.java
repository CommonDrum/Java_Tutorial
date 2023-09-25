package Day22_09;

public class Bill {

    protected Person owner;
    protected double balance;


    Bill(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public boolean deposit(double DepositAmount) {

        if (DepositAmount >= 0) {
            balance += DepositAmount;
            return true;
        } else {
            return false;
        }

    }

    public boolean withdraw(double withdrawalAmount) {

        if (withdrawalAmount >= balance) {
            balance -= withdrawalAmount;
            return true;
        } else {
            return false;
        }

    }

    public boolean transfer(Bill receiver, double transferAmount) {
        if (transferAmount >= balance) {
            this.withdraw(transferAmount);
            receiver.deposit(transferAmount);
            return true;
        } else {
            return false;
        }

    }

    public void update() {
        System.out.println("Basic Bill");
    }

    @Override
    public String toString() {
        return "Owner " + owner.toString() + " Balance: " + balance;
    }


}
