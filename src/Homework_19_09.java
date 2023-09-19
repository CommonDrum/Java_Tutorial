import java.lang.Math;

public class Homework_19_09 {

    public static void main(String[] args) {

        int[] bitsArray = new int[]{1, 0};
        int result1 = convertFromBinary(bitsArray);
        System.out.println(result1);

        System.out.println("_____________________");

        int number = 123;
        int[] digitArray = splitToDigits(number);
        printIntArray(digitArray);

        System.out.println("_____________________");

        int[] arrayToSwap = new int[]{1, 2, 3};
        int source = 0;
        int destination = 1;
        swap(arrayToSwap, source, destination);
        printIntArray(arrayToSwap);

        System.out.println("_____________________");

    }

    public static int convertFromBinary(int[] bits_array) {
        int result = 0;
        int arrayLength = bits_array.length;

        for (int i = 0; i < arrayLength; i++) {

            result += (int) Math.pow(2, arrayLength - i - 1) * bits_array[i]; // Zakładając, że input to tylko 1/0
        }

        return result;
    }

    /*Utwórz statyczną funkcję splitToDigits przyjmującą
     jako argument wartość całkowitą dodatnią i zwracającą jednowymiarową
      tablicę wartości całkowitych dodatnich. Celem funkcji będzie utworzenie
       tablicy o rozmiarze tożsamym z ilością cyfr liczby dostarczonej jako argument,
     a następnie wypełnienie jej cyframi z jakich składa się dostarczona liczba.
     */

    public static int[] splitToDigits(int number) {

        int length = (int) (Math.log10(number) + 1);

        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            result[i] = number % 10;
            number /= 10;
        }

        return result;
    }
   /*
   Dany jest nagłówek metody: public static void swap ( int [ ] tab , int source , int destination)
   Uzupełnij ciało tej metody, tak aby wskazane przez parametry source i destination
   elementy tablicy zostały zamienione miejscami
   */

    public static void swap(int[] tab, int source, int destination) {

        if (tab.length > source && tab.length > destination && source >= 0 && destination >= 0) {
            int temp = tab[source];
            tab[source] = tab[destination];
            tab[destination] = temp;
        }

    }

    public static void printIntArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }


}
