package sorting;

public class BubbleSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22,
                11, 90,33,45,43,65 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = false;
                }

            }
            if (swapped) {
                System.out.println("No swap in pass " + i);
                break;
            }
        }
        System.out.println("Sorted array");
        printArray(arr);

    }
}
