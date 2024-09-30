package loops;

import java.util.*;

public class IncreasingNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int no = (i + j) % 2 == 0 ? 1 : 0;
                System.out.print(no + " ");
            }
            System.out.println();
        }
    }
}
