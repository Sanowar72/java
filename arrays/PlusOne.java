package arrays;

import java.util.Scanner;

public class PlusOne {

    public static int[] plusOne(int[] nums) {
        int n = nums.length;
        // StringBuilder str = new StringBuilder();

        // for (int i : nums) {
        // str.append(i);
        // }

        // int number = Integer.parseInt(str.toString()) + 1;
        // String resultStr = String.valueOf(number);

        // // Create the result array based on the new number of digits
        // int[] res = new int[resultStr.length()];

        // // Fill result array with digits from resultStr
        // for (int i = 0; i < resultStr.length(); i++) {
        // res[i] = Character.getNumericValue(resultStr.charAt(i));
        // }

        // return res;

        // another approach
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            } else
                nums[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Please enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = plusOne(arr);

        System.out.print("Resultant array is: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
