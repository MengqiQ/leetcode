import java.util.Scanner;
import java.util.*;

public class commentline {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
//        int[] result = new int[N];

        for (int iter = 0; iter < N; iter++) {
            List<Integer> people = new LinkedList<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int[] A = new int[m];
            int index = 0;
            for (int i = 0; i < m; i++) {
                A[i] = in.nextInt();
            }
            for (int j = 0; j < n; j++) {
                people.add(j);
            }
            int z = 0;
            while (people.size() != 1) {

//                System.out.println(people.size());
//                System.out.println(A[z] % people.size());
                index = (index + A[z] - 1) % people.size();
                z = (z+1) % m;
//                System.out.println(index);
                people.remove(index);
            }
            System.out.println(people.get(0));
        }
    }

}