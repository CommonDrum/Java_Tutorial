package Day21_09.Phone;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class CellPhone extends Phone {
    protected int callHistoryLimit = 10;
    protected Queue<String> callHistory = new ArrayDeque<String>();

    public CellPhone(String communicationInterface, Color color) {
        super(communicationInterface, color);
    }

    @Override
    public void call(String number) {
        super.call(number);

        if (callHistory.size() >= callHistoryLimit) {
            callHistory.remove();
        }

        callHistory.add(number);
    }

    @Override
    public void showCallHistory() {

            for (String call : callHistory) {
                System.out.println(call);
            }
    }

}
