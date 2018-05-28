import java.util.Scanner;

public class threeNumber {
    public int num_of_operations(int a, int b, int c) {
        int tmp = b - a;
        if (tmp % 2 == 1) {
            return c - b + tmp / 2 + 2;
        }

        return c - b + tmp / 2;
    }

    public static void main(String[] args) {
        threeNumber m = new threeNumber();
        Scanner in = new Scanner(System.in);

        int res = 0;
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            res = m.num_of_operations(a, b, c);
        }
        System.out.println(res);
    }



}