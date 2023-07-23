package Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        int[] array1 = new int[5];

        int[] array2;
        int[] array3 = {1, 2, 3, 4, 5};

        String[] strArr = {"C", "B", "AA", "A"};
        int[] numArr = {3, 52, 12, 64};

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(numArr));

        Arrays.sort(strArr);
        Arrays.sort(numArr);

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(numArr));
    }
}
