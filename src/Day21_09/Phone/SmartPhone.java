package Day21_09.Phone;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class SmartPhone extends CellPhone{

    ArrayList<Person> contactList = new ArrayList<>();

    public SmartPhone(String communicationInterface, Color color){
        super(communicationInterface,color);
    }

    public void addContact(Person contact){
        this.contactList.add(contact);
    }

    public ArrayList<Person> getContactList(){
        return this.contactList;
    }

    public Person getContactByNumber(String number){
        for(Person contact : contactList){
            if(Objects.equals(contact.getNumber(), number)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public void showCallHistory(){
        for (String callNumber : callHistory) {
            Person contact = getContactByNumber(callNumber);
            if (contact!= null){
                System.out.println(contact.getFirstName() + " " + contact.getSecondName() + " " + contact.getNumber());
            }else{
                System.out.println(callNumber);
            }

        }

    }

}
