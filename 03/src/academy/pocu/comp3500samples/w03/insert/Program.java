package academy.pocu.comp3500samples.w03.insert;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
        int[] intArr = {33, 1, 4, 23, 12, 30, 19, 5, 5};
        System.out.println(Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i++) {

            int target = intArr[i];
            int j = i - 1;

            while (j >= 0 && target < intArr[j]) {
                intArr[j + 1] = intArr[j];
                j--;
            }

            intArr[j + 1] = target;
        }
        System.out.println(Arrays.toString(intArr));
    }

    private static void test1() {
        int[] intArr = {33, 1, 4, 23, 12, 30, 19, 5, 5};
        System.out.println(Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 1; j < intArr.length - i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    swap(intArr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(intArr));
    }

    private static void swap(int[] intArr, int i1, int i2) {
        int temp = intArr[i1];
        intArr[i1] = intArr[i2];
        intArr[i2] = temp;
    }
}
