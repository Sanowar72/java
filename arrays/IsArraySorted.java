package arrays;

import java.util.*;

public class IsArraySorted {
    public static boolean isArraySorted(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = s.nextInt();
        if (n <= 0) {
            System.out.println("Array is empty, considered sorted.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        // if (isArraySorted(arr)) {
        System.out.println("Array was " + (isArraySorted(arr) ? "" : "not") + " sorted");
        // } else {
        // System.out.println("Array was not sorted :");
        // }
    }
}
