import java.util.Scanner;

public class Sum {
    public static void main(String args[]){
        int a, b, sum=0;
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Sum of "+a+" & "+b+" is "+sum);
    }
}
