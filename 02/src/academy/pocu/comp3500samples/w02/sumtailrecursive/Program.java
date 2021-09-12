package academy.pocu.comp3500samples.w02.sumtailrecursive;

public class Program {
    public static void main(String[] args) {
        int sum = sumTailRecursive(10, 0);

        System.out.println(sum); // 55

        sum = sumTailRecursive(100, 0);

        System.out.println(sum); // 5050

        sum = sumTailRecursive(1000, 0);

        System.out.println(sum); // 500500

//        sum = sumTailRecursive(100000, 0); // ?? -> stackoverflow
//        System.out.println(sum);

        sum = sumTailRecursiveWithLambda(100000, 0).invoke();
        System.out.println(sum); // 704982704

        sum = sumWithLoop(100000);
        System.out.println(sum); // 704982704

        sum = sumWithFormula(100000);
        System.out.println(sum); // 704982704

    }

    private static int sumTailRecursive(int n, int sum) {
        if (n <= 0) {
            return sum;
        }

        return sumTailRecursive(n - 1, sum + n);
    }

    private static TailCall<Integer> sumTailRecursiveWithLambda(int n, int sum) {
        if (n <= 0) {
            return TailCalls.done(sum);
        }

        return TailCalls.call(() -> sumTailRecursiveWithLambda(n - 1, sum + n));
    }

    private static int sumWithLoop(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    private static int sumWithFormula(int n) {
        return n * (n + 1) / 2;
    }


}
