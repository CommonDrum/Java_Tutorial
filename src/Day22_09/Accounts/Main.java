package Day22_09.Accounts;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Person grzes = new Person("Grzes", "Kowalski", "123-456-789");

        ArrayList<Bill> bills = new ArrayList<>();
        bills.add(new Bill(grzes, 100));
        bills.add(new Account(grzes, 100));
        bills.add(new VIPAccount(grzes, 100));

        bills.get(0).deposit(1000);
        bills.get(0).withdraw(100);
        bills.get(0).transfer(bills.get(1), 100);
        bills.get(0).update();

        if( bills.get(1) instanceof Account){
            ((Account) bills.get(1)).setInterest(5.0);

        }
        bills.get(1).deposit(500);
        bills.get(1).withdraw(100);
        bills.get(1).transfer(bills.get(2), 200);
        bills.get(1).update();

        if( bills.get(2) instanceof VIPAccount){
            ((VIPAccount) bills.get(2)).setInterest(10);

        }
        bills.get(2).deposit(500);
        bills.get(2).withdraw(100);
        bills.get(2).transfer(bills.get(0), 300);
        bills.get(2).update();

        for (Bill bill : bills) {
            bill.update();
            System.out.println(bill);
        }

    }
}
