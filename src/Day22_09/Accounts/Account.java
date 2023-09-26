package Day22_09.Accounts;

public class Account extends Bill {

    public static double interest;

    Account(Person owner, double balance) {
        super(owner, balance);
    }

    public void setInterest(double interest) {
        Account.interest = interest;

    }


    @Override
    public void update() {
        //Czy może tak być?
        balance = balance * interest;

    }

    @Override
    public String toString() {
        return "Owner " + owner.toString() + " Balance: " + balance + " Interest: " + interest;
    }

}
