package academy.pocu.comp3500samples.w02.factorialRecursiveEx;

public class Program {

    public static void main(String[] args) {

    }


    // 재귀 함수
    public static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // 꼬리 재귀 함수
    public static int factorialRecursive(int n, int fac) {
        if (n <= 1) {
            return fac;
        }

        return factorialRecursive(n - 1, n * fac); // 이 함수 호출이 마지막 명령어 !
    }


}

