package loops;

import java.util.*;

public class ArmstrongNo {
    public static int armStrongNo(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp = temp / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        System.out.println(armStrongNo(n) == n
                ? n + " is an Armstrong number"
                : n + " is not an Armstrong number");

        s.close();

    }
}
