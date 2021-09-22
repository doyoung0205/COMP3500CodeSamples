package academy.pocu.comp3500samples.w03.select;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] intArr = {33, 1, 4, 23, 12, 30, 19, 5, 5};
        System.out.println(Arrays.toString(intArr));
        for (int i = 0; i < intArr.length - 1; i++) {
            int minIndex = findMinIndex(intArr, i);
            swap(intArr, i, minIndex);
        }
        System.out.println(Arrays.toString(intArr));
    }

    private static int findMinIndex(int[] intArr, int i) {
        int minIndex = i;
        for (int j = i + 1; j < intArr.length; j++) {
            if (intArr[minIndex] > intArr[j]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    private static void swap(int[] intArr, int i, int minIndex) {
        int temp = intArr[i];
        intArr[i] = intArr[minIndex];
        intArr[minIndex] = temp;
    }


}
