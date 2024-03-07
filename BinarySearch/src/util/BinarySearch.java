package util;

import java.util.List;

public class BinarySearch {
    public static Integer binarySearch(List<Integer> list, int item) {
        int low = 0;
        int high = list.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list.get(mid);
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return null;
    }
}
