import java.util.Scanner;

public class Hypotenuse {
    public static void main(String args[]){
        double l, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of triangle ");
        l = sc.nextDouble();
        System.out.println("Enter the breath of triangle ");
        b = sc.nextDouble();
        double h = Math.sqrt(((Math.pow(l,2)+Math.pow(b,2))));
        System.out.println("the hypotenuse of triangle with length "+l+" and breath "+b+" is "+h);
    }
}
