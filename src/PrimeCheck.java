import java.util.Scanner;

public class PrimeCheck {
    public static void main(String args[]){
        int num, f=0;
        System.out.println("Enter any number for checking if prime or not");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            if((num%i) == 0)
            {
                f++;
            }
        }
        if(f==2)
        {
            System.out.println(num+" is prime number");
        }
        else
        {
            System.out.println(num+" has more than 2 factors and is non-prime number");
        }
    }
}
