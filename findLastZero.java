public class findLastZero {
    public int findLastZero(int[] numbers) {
        int lo = 0;
        int hi = numbers.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (numbers[mid] > 0) {
                hi = mid - 1;
            } else if (numbers[mid] < 0) {
                lo = mid + 1;
            } else {
                if (mid == numbers.length - 1 || numbers[mid + 1] > 0) {
                    return mid;
                }
                lo = mid + 1;

            }
        }
        return -1;
    }
}
