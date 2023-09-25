package Day22_09;

public class Person {
    private String firstName;
    private String secondName;
    private String number;

    public Person(String firstName, String secondName, String number) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.number = number;

    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


}