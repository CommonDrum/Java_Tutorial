package Day22_09.Arrays;

import java.util.*;

public class Tablice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int number : list) {
                System.out.println(number);
        }


        ArrayList<String> names = new ArrayList<>();

        names.add("Tomek");
        names.add("Ania");
        names.add("Tomek");
        names.add("Krzys");
        names.add("Grzes");
        names.add("Tomek");

        names.removeIf(name -> name.equals("Tomek"));

        System.out.println(names);

        int[] sumArray = new int[]{1,2,3,4};
        System.out.println("sumIntArray: " + sumIntArray(sumArray));

        //ArrayList<Integer> biggerArray = new ArrayList<>(Arrays.asList(sumArray))
        //System.out.println("getBiggerThan: " + getBiggerThan(sumArray, 3));

        String[] namesArray = {"Alice", "Bob", "Christopher"};
        System.out.println("getLongestName: " + getLongestName(namesArray));

        System.out.println("doesNameExist (Bob): " + doesNameExist(namesArray, "Bob"));
        System.out.println("doesNameExist (John): " + doesNameExist(namesArray, "John"));


        String[] arrayA = {"A", "B", "C"};
        String[] arrayB = {"B", "C", "D", "E"};


        // Test generateRandom




    }



    public static int sumIntArray(int[] array) {
        int result = 0;

        for (Integer number : array) {
            result += number;
        }

        return result;
    }

    public static ArrayList<Integer> getBiggerThan(ArrayList<Integer> array, int numberToCompare) {

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer number : array) {
            if (number > numberToCompare) {
                result.add(number);
            }
        }

        return result;
    }


    public static String getLongestName(String[] array) {
        String longestName = "";

        for (String name : array) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        return longestName;
    }

    public static boolean doesNameExist(String[] array, String nameToFind) {

        for (String name : array) {
            if (Objects.equals(nameToFind, name)) {
                return true;
            }
        }
        return false;
    }

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return array;
    }


    public static String[] getCommonElements(String[] array1, String[] array2) {
        Set<String> result = new HashSet<>();
        for (String name : array1) {
            if (java.util.Arrays.asList(array2).contains(name)) {
                result.add(name);
            }
        }

        return result.toArray(new String[0]);
    }

    public static int[] generateRandom() {
        Random random = new Random();
        int arrayLen = random.nextInt(6) + 2;
        int[] array = new int[arrayLen];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
        }

        return bubbleSort(array);
    }


}
