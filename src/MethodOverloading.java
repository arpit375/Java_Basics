import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Enter 2 int numbers");
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("sum of "+x+" and "+y+" is "+add(x,y));
        System.out.println();
        System.out.println("Enter 3 int numbers");
        int p,q,r;
        p= sc.nextInt();
        q= sc.nextInt();
        r= sc.nextInt();
        System.out.println("sum of "+p+","+q+" and "+r+" is "+add(p,q,r));
        System.out.println();
        System.out.println("Enter 2 decimal numbers");
        double a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("sum of "+a+" and "+b+" is "+add(a,b));
        System.out.println();
        System.out.println("Enter 2 of strings");
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("concatenation of strings "+str1+" and "+str2+" is "+add(str1,str2));
    }
    public static int add(int a, int b)
    {
        System.out.println("sum method called is #1");
        return a+b;
    }
    public static int add(int a, int b, int c)
    {
        System.out.println("sum method called is #2");
        return a+b+c;
    }
    public static double add(double a, double b)
    {
        System.out.println("sum method called is #3");
        return a+b;
    }
    public static String add(String m, String n)
    {
        System.out.println("sum method called is #4");
        String scr= m.concat(n);
        return scr;
    }
}
