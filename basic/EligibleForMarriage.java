import java.util.Scanner;

public class EligibleForMarriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the boy");
        int boyAge = sc.nextInt();
        System.out.println("Enter the age of the girl");
        int girlAge = sc.nextInt();
        if (boyAge >= 21 && girlAge >= 18) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
