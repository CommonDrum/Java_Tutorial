package Day21_09.Phone;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        ArrayList<Phone> telephones = new ArrayList<Phone>();


        telephones.add(new Phone("unknown",new Color(1)));
        telephones.add(new CellPhone("unknown",new Color(2)));
        telephones.add(new SmartPhone("unknown",new Color(3)));

        Person john = new Person("John", "Doe", "987-765-432");

        if (telephones.get(2) instanceof SmartPhone) {
            ((SmartPhone) telephones.get(2)).addContact(john);
        }

        for (Phone telephone : telephones) {
            for (int j = 0; j < 10; j++) {
                switch (j % 2) {
                    case 0:
                        telephone.call("123-456-789");
                        break;
                    case 1:
                        telephone.call("987-765-432");
                        break;
                }
            }
            System.out.println("-----Call History-----");
            telephone.showCallHistory();
        }
    }
}
