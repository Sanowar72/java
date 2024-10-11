package loops;

import java.util.*;

public class ReverseMultipleNo {
    public static int reverseNo(int no) {
        int rev = 0;
        while (no != 0) {
            int rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many digits you want to check : ");
        int noOfInputs = s.nextInt();
        for (int i = 1; i <= noOfInputs; i++) {
            System.out.println("Enter the no you want to reverse : ");
            int no = s.nextInt();
            System.out.println(reverseNo(no));
        }
    }
}
