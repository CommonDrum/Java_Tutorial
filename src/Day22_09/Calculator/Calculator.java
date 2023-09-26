package Day22_09.Calculator;


// Interface "Operation"
interface Operation {
    double compute(double arg1, double arg2);
}

public class Calculator {
    public static void main(String[] args) {

        String operationType = "addition";

        Operation operation;

        // Implementation using "if"
        if ("addition".equals(operationType)) {
            operation = (a, b) -> a + b;
        } else if ("subtraction".equals(operationType)) {
            operation = (a, b) -> a - b;
        } else if ("multiplication".equals(operationType)) {
            operation = (a, b) -> a * b;
        } else if ("division".equals(operationType)) {
            operation = (a, b) -> a / b;
        } else {
            System.out.println("Unknown operation");
            return;
        }

        double result = operation.compute(5.2, 4.3);
        System.out.println("Result: " + result);
    }
}
