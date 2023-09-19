import java.lang.Math;

public class Homework_19_09 {

    public static void main(String args[]) {

        int[] bitsArray = new int[]{1, 0};
        int result1 = convertFromBinary(bitsArray);
        System.out.println(result1);

    }

    public static int convertFromBinary(int[] bits_array) {
        int result = 0;
        int arrayLength = bits_array.length;

        for (int i = 0; i < arrayLength; i++) {

            result += (int) Math.pow(2, arrayLength - i - 1) * bits_array[i];
        }

        return result;
    }


}
