import java.util.*;
public class FindMinThreeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter three number ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int min=n1;
        if(n2<min) min=n2;
        else if(n3<min) min =n3;
        System.out.println("min no is : "+min);
    }
}
