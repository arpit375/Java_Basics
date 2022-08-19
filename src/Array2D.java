import java.util.Scanner;

public class Array2D {
    public static void main(String args[]){
        String car [] [] = new String[3][3];
        System.out.println("Enter the car names for 3x3 matrix");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<car.length;i++)
        {
            for(int j=0;j<car[i].length;j++)
            {
                System.out.print("Enter car name at "+(i+1)+" row and "+(j+1)+" column ");
                car[i][j]= sc.nextLine();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The 3x3 car matrix is as below ");
        for(int i=0;i<car.length;i++)
        {
            for(int j=0;j<car[i].length;j++)
            {
                System.out.print(car[i][j]+" ");
            }
            System.out.println();
        }
    }
}
