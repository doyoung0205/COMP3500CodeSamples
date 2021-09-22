package academy.pocu.comp3500samples.w02.stackframeex;

public class Program {


    public static void main(String[] args) {
        puff(4, 6, 4, 0);
    }

    public static void puff(int n, int a, int b, int index) {

        index++;

        System.out.println("스택 프레임" + index);

        if (n <= 0) {
            return;
        }

        System.out.println(String.format("%d %d %d", n, a, b));


        puff(n - 3, a, b + n, index);
        puff(n - 1, b, a + n, index);
        puff(n - 2, b, a + n, index);
    }
}
