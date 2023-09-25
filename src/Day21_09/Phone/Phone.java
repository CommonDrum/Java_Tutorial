package Day21_09.Phone;

import java.awt.*;
import javax.swing.*;

public class Phone {
    private String communicationInterface;
    private Color color;

    public Phone(String communicationInterface, Color color) {
        this.communicationInterface = communicationInterface;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCommunicationInterface(String communicationInterface) {
        this.communicationInterface = communicationInterface;

    }

    public Color setColor() {
        return this.color;
    }

    public String getCommunicationInterface() {
        return this.communicationInterface;

    }


    public void call(String number) {
        System.out.println(number);
    }

    public void showCallHistory() {

        System.out.println("no history");
    }

}
