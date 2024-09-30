import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
        switch(n){
            case 1:
            System.out.println("this is case 1");
            break;
            case 2:
            System.out.println("this is case 2");
            break;
            case 3:
            System.out.println("this is case 3");
            break;
            default:
            System.out.println("this is default case");
        }
    }
}
