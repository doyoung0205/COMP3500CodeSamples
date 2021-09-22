package academy.pocu.comp3500samples.w03.bubble;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        int[] intArr = {1, 4, 23, 12, 30, 19, 5, 5};
        System.out.println(Arrays.toString(intArr));


        // 오름차순 정렬
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {

                if (intArr[j] < intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(intArr));
    }
}
