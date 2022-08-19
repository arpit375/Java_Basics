import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Enter 2 int numbers");
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("sum of "+x+" and "+y+" is "+add(x,y));
    }
    public static int add(int a, int b)
    {
        return a+b;
    }
}
