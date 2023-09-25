package Day21_09.Phone;

public class Person {
    private String firstName;
    private String  secondName;
    private String number;

    public Person(String firstName, String secondName, String number) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.number = number;

    }

    // Sprawdź layout getterów i setterów w Javie

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
