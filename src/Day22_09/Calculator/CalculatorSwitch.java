package Day22_09.Calculator;

import java.lang.invoke.SwitchPoint;

public class CalculatorSwitch {

    public static void main(String[] args){
        String operationType = "addition";

        Operation operation;

        switch(operationType) {
            case "addition":
                operation = (a,b) -> a + b;
                break;
            case "substraction":
                operation = (a,b) -> a - b;
                break;
            case "multiplication":
                operation = (a,b) -> a * b;
                break;
            case "division":
                operation = (a,b) -> a / b;
                break;
            default:
                System.out.println("Unknown operation");
                return;
        }

        double result = operation.compute(10,2);
        System.out.println("Result: " + result);

    }



}
