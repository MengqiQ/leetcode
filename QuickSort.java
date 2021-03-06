import java.util.Arrays;

public class QuickSort {
    public void sortIntegers(int[] A){
        if (A == null || A.length == 0) {
            return;
        }
        quickSort(A, 0, A.length - 1);
    }
    private void quickSort(int[] A, int start, int end){
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        // pivot is value
        int pivot = A[(start + end) /2];
        while (left <= right) {
            while (left <= right && A[left] < pivot) {
                left++;
            }
            while (left <= right && A[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
                left++;
                right--;
            }
        }
        quickSort(A, start, right);
        quickSort(A, left, end);

    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] A = new int[]{3, 1, 2, 4, 5};
        System.out.println(1);
        qs.sortIntegers(A);
        System.out.println(2);
        System.out.println(Arrays.toString(A));
        System.out.println(3);
    }
}
