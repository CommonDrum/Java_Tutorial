package Day19_09;

import java.lang.Math;

public class Homework_19_09 {

    public static void main(String[] args) {

        System.out.println("__________convertFromBinary___________");

        int[] bitsArray = new int[]{1, 0, 0, 0, 1, 1, 0, 1, 1};
        int result1 = convertFromBinary(bitsArray);
        System.out.println(result1);

        System.out.println("__________splitToDigits___________");

        int number = 123;
        int[] digitArray = splitToDigits(number);
        printIntArray(digitArray);

        System.out.println("__________swap___________");

        int[] arrayToSwap = new int[]{1, 2, 3};
        int source = 0;
        int destination = 1;
        swap(arrayToSwap, source, destination);
        printIntArray(arrayToSwap);

        System.out.println("__________squares___________");

        int screeenWidth = 12;
        int screenHeight = 17;
        int side = 5;

        int[][] squares = calculateSquares(screeenWidth, screenHeight, side);
        printIntArray(squares[0]);
        System.out.println("_________y________");
        printIntArray(squares[1]);


    }

    public static int convertFromBinary(int[] bitsArray) {
        int result = 0;
        int arrayLength = bitsArray.length;

        for (int i = 0; i < arrayLength; i++) {

            result += (int) Math.pow(2, arrayLength - i - 1) * bitsArray[i];
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

    /*
    Dany jest nagłówek funkcji: public static int [ ] [ ] calculateSquares ( int screenWidth , int screenHeight , int side)
    przyjmujący jako argumenty odpowiednio: szerokość i wysokość ekranu,
    oraz długość boku kwadratu. Uzupełnij ciało tej metody algorytmem wyliczającym
    ile kwadratów o zadanej długości boku można umieścić na ekranie.
    Następnie wyliczyć współrzędne (górnego lewego rogu) x i y wszystkich kwadratów i zwróć je w
    postaci dwuwymiarowej tablicy w której pierwsza kolumna opisuje współrzędne x a druga y
     */

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {

        int squaresInRow = screenWidth / side;
        int squaresInColumn = screenHeight / side;

        int totalSquares = squaresInColumn * squaresInRow;

        int[][] result = new int[2][totalSquares]; // Can I return it?

        for (int i = 0; i < totalSquares; i++) {
            result[0][i] = (i + i * side) % (squaresInRow * side);
            result[1][i] = (i + i * side) % (squaresInColumn * side);
        }

        return result;
    }

    public static void printIntArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static void printIntArrayIndex(int[] array, int index) {
        System.out.println(array[index]);
    }


}
