import java.util.*;
class GreatestThreeDigit{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int greatestNo=n1;
        if(greatestNo<n2) greatestNo=n2;
        else if (greatestNo<n3)greatestNo=n3;
        System.out.println("greatest no is : "+greatestNo);
        sc.close();
    }
}