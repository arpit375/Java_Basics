import java.util.Scanner;

public class SetMatrix0 {
    public static void main(String args[])
    {
        int a[][]={}, b[][]={};
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix");
        r= sc.nextInt();
        System.out.println("Enter the number of columns in matrix");
        c= sc.nextInt();
        System.out.println("Enter "+(r*c)+" elements in matrix of "+r+"x"+c);
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
//        for(int i=0;i<r;i++)
//        {
//            for(int j=0;j<c;j++)
//            {
//                if(a[i][j]==0)
//                {
//                    b[i][j]=0;
//                }
//            }
//        }
//        System.out.println("Matrix 0 is");
//        for(int i=0;i<r;i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print(b[i][j]);
//            }
//            System.out.println();
//        }
    }
}
