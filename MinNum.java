import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinNum {

    int MIN = Integer.MAX_VALUE;

    public int minEquation(int[] numbers) {
        dfs(new ArrayList<Integer>(), numbers, 0);
        return MIN;
    }

    private int calc(int x, int y, int z) {
        return x * (x + y) - y * y + z;
    }

    private void dfs(List<Integer> one, int[] numbers, int start) {

        if (one.size() == 3) {
            MIN = Math.min(calc(one.get(0), one.get(1), one.get(2)), MIN);
            MIN = Math.min(calc(one.get(0), one.get(2), one.get(1)), MIN);

            MIN = Math.min(calc(one.get(1), one.get(0), one.get(2)), MIN);
            MIN = Math.min(calc(one.get(1), one.get(2), one.get(0)), MIN);


            MIN = Math.min(calc(one.get(2), one.get(1), one.get(0)), MIN);
            MIN = Math.min(calc(one.get(2), one.get(0), one.get(1)), MIN);
            return;
        }

        for (int i = start; i < numbers.length; i++) {
            if (i > start && numbers[i] == numbers[i - 1]) {
                continue;
            }
            one.add(numbers[i]);
            dfs(one, numbers, i + 1);
            one.remove(one.size() - 1);
        }

    }

    public static void main(String[] args) {
        MinNum m = new MinNum();
        int[] numbers = new int[10];
        int p = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            numbers[p++] = in.nextInt();
        }
        System.out.println(m.minEquation(numbers));
    }

}