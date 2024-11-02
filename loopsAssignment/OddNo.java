package loopsAssignment;

import java.util.*;

public class OddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();
        int count = 0;
        int number = 1;

        while (count < n) {
            if (number % 2 != 0) {
                System.out.println(number);
                count++;
            }
            number++; 
        }
    }
}
