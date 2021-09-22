package academy.pocu.comp3500samples.w02.pnp;

public class Program {
    public static void main(String[] args) {

    }


    public static boolean hasGreater(int[] nums, int k) {
        for (int num : nums) {
            if (num > k) {
                return true;
            }
        }
        return false;
    }
}
