package academy.pocu.comp3500samples.w03.quick;

public class Program {
    public static void main(String[] args) {
        int[] intArr = {33, 1, 4, 23, 12, 30, 19, 5, 5};
        quickSort(intArr, 0, intArr.length - 1);

    }

    private static void quickSort(int[] intArr, int i, int i1) {
        quickSortRecursive(intArr, i, i1);
    }

    private static void quickSortRecursive(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int pivotPos = partition(nums, left, right);

        quickSortRecursive(nums, left, pivotPos - 1);
        quickSortRecursive(nums, pivotPos + 1, right);
    }

    private static int partition(int[] nums, int left, int right) {

        int pivot = nums[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                ++i;
                swap(nums, i, j);
            }
        }
        int pivotPos = i + 1;
        swap(nums, pivotPos, right);

        return pivotPos;
    }

    private static void swap(int[] intArr, int i1, int i2) {
        int temp = intArr[i1];
        intArr[i1] = intArr[i2];
        intArr[i2] = temp;
    }

}
