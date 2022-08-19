import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("enter numbers to division");
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter the 1st number");
            int a = sc.nextInt();
            System.out.println("enter the 2nd number");
            int b = sc.nextInt();
            int c=a/b;
            System.out.println("the result is "+c);
        }
//        catch (Exception e){
//            System.out.println("there was some issue");
//        }
        catch (ArithmeticException ae){
            System.out.println("You cannot divide the number by 0");
        }
        catch (InputMismatchException ime){
            System.out.println("Please enter an integer value only");
        }
        finally {
            sc.close();
            System.out.println("in finally block");
        }

    }
}
