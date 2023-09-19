import java.lang.Math;

public class Homework_19_09 {

    public static void main(String[] args) {

        int[] bitsArray = new int[]{1, 0};
        int result1 = convertFromBinary(bitsArray);
        System.out.println(result1);

        int number = 123;
        int[] digitArray = splitToDigits(number);
        printIntArray(digitArray);

    }

    public static int convertFromBinary(int[] bits_array) {
        int result = 0;
        int arrayLength = bits_array.length;

        for (int i = 0; i < arrayLength; i++) {

            result += (int) Math.pow(2, arrayLength - i - 1) * bits_array[i];
        }

        return result;
    }


    public static int[] splitToDigits(int number) {

        int length = (int) (Math.log10(number) + 1);

        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            result[i] = number % 10;
            number /= 10;
        }

        return result;
    }

    public static void printIntArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }


}
