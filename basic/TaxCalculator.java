import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        double billAmount = sc.nextDouble();

        double taxRate = (billAmount > 50000) ? 0.10 : 0.05;
        double taxAmount = billAmount * taxRate;

        System.out.println("The tax amount is: " + taxAmount);
    }
}
