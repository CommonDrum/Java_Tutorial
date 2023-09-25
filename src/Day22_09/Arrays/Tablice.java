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


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sumIntList(numbers));

        List<Integer> biggerThanThree = getBiggerThan(numbers, 3);
        System.out.println(biggerThanThree);

        List<String> names2 = Arrays.asList("Tomek", "Ania", "Grzegorz", "Dawid");
        System.out.println(getLongestName(names2));

        System.out.println(doesNameExist(names2, "Ania"));
        System.out.println(doesNameExist(names2, "Krzysztof"));

        List<Integer> unsortedNumbers = Arrays.asList(5, 3, 1, 4, 2);
        System.out.println(bubbleSort(unsortedNumbers));

        List<String> namesList1 = Arrays.asList("Tomek", "Ania", "Grzegorz");
        List<String> namesList2 = Arrays.asList("Ania", "Grzegorz", "Dawid");
        System.out.println(getCommonElements(namesList1, namesList2));

        System.out.println(generateRandom());
    }




    public static int sumIntList(List<Integer> numbers) {
        int result = 0;

        for (Integer number : numbers) {
            result += number;
        }

        return result;
    }

    public static List<Integer> getBiggerThan(List<Integer> numbers, int numberToCompare) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > numberToCompare) {
                result.add(number);
            }
        }

        return result;
    }

    public static String getLongestName(List<String> names) {
        String longestName = "";

        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        return longestName;
    }

    public static boolean doesNameExist(List<String> names, String nameToFind) {
        for (String name : names) {
            if (Objects.equals(nameToFind, name)) {
                return true;
            }
        }
        return false;
    }

    public static List<Integer> bubbleSort(List<Integer> numbers) {
        int n = numbers.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    Collections.swap(numbers, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return numbers;
    }

    public static List<String> getCommonElements(List<String> list1, List<String> list2) {
        Set<String> result = new HashSet<>(list1);
        result.retainAll(list2); // Retains only the elements in this set that are contained in the specified collection (list2).

        return new ArrayList<>(result);
    }

    public static List<Integer> generateRandom() {
        Random random = new Random();
        int listLen = random.nextInt(6) + 2;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < listLen; i++) {
            numbers.add(random.nextInt(9) + 1);
        }

        return bubbleSort(numbers);
    }


}
