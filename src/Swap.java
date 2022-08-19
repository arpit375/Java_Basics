public class Swap {
    public static void main(String args[]){
        String x = "Red";
        String y = "Blue";

        System.out.println("before swapping the values are");
        System.out.println("X is "+x);
        System.out.println("Y is "+y);

        String temp = null;         // temp variable

        temp = x;
        x = y;
        y = temp;

        System.out.println("after swapping the values are");
        System.out.println("X is "+x);
        System.out.println("Y is "+y);
    }
}
