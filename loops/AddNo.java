package loops;

import java.util.*;

public class AddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int rev = n % 10;
            sum = sum + rev;
            n = n / 10;
        }
        System.out.println("Sum of digits is : " + sum);
    }
}
