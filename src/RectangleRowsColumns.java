import java.util.Scanner;

public class RectangleRowsColumns {
    public static void main(String args[]){
        int r,c,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number(Integer) of rows");
        r = sc.nextInt();
        System.out.println("Enter number(Integer) of columns");
        c = sc.nextInt();
        int col=c;
        for(i=1;i<=r;i++){
            for(j=1;j<=c;j++){
                if(j==1){
                    System.out.print("*");
                }
                if(i==r){
                    System.out.print("*");
                }
                if(i==1){
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}