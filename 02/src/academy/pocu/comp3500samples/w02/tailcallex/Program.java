package academy.pocu.comp3500samples.w02.tailcallex;

public class Program {

    public int calculateSignature(int[] data, int multiplier) {
        int[] tempData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            tempData[i] = data[i] * multiplier;
        }
        return accumulate(tempData); // 꼬리 함수
    }

    private int accumulate(int[] tempData) {
        // TODO something
        return 0;
    }
}
