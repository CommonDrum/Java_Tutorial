package Day20_09;

public class IntArr {

    public static void main(String[] args) {
        int[] input = new int[]{4, 5, 2, 1, 2, 3};
        IntArr array = new IntArr(input);

        System.out.println("--------show--------");

        array.show();

        System.out.println("--------max--------");

        System.out.println(array.max());

        System.out.println("--------sorted--------");

        IntArr sortedArray = array.sorted();

        sortedArray.show();

        System.out.println("--------reversed--------");

        IntArr reversed = sortedArray.reversed();
        reversed.show();


    }

    private int[] arr;

    IntArr(int n) {
        arr = new int[n];
    }

    IntArr(int[] arrIn) {
        arr = arrIn;
    }

    public void show() {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public int max() {
        int maxElement = arr[0];

        for (int j : arr) {
            if (maxElement < j) {
                maxElement = j;
            }
        }
        return maxElement;
    }
//
    public IntArr sorted() {

        int[] arrayToSort = arr;

        int i, j;
        boolean swapped;
        for (i = 0; i < arrayToSort.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arrayToSort.length - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        return new IntArr(arrayToSort);
    }

    public IntArr reversed() {

        int[] arrayToReverse = new int[arr.length];


        for (int i = 0; i < arrayToReverse.length; i++) {
            arrayToReverse[i] = arr[(arr.length - 1) - i];
        }

        return new IntArr(arrayToReverse);

    }
}
