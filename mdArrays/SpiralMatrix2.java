package mdArrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        int top = 0, right = n - 1;
        int bottom = n - 1, left = 0;
        int[][] arr = new int[n][n];
        int num = 1;
        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = num;
                num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num;
                num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = num;
                num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = num;
                num++;
            }
            left++;
        }
        System.out.println("Spiral Order Traversal of the matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
