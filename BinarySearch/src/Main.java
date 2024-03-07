import util.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 7, 8, 12, 21, 25};
        List<Integer> num = Arrays.asList(array);
        System.out.println(BinarySearch.binarySearch(num, 6));
    }
}