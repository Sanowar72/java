package arrays;

import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] n, int target) {
        int low = 0, high = n.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (n[mid] == target)
                return mid;
            else if (n[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements in sorted order : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the target element to search : ");
        int target = s.nextInt();
        int index = binarySearch(arr, target);
        if (index == -1) {
            System.out.println("Element is not present in array : ");
        } else {
            System.out.println("Element is present in array on this index " + index);
        }
    }
}