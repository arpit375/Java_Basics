public abstract class SquarePower implements Square {
    public static void main(String[] args) {
        int a=5;
        Square s = (x) -> x*x;
        int sq= s.calculateSquare(a);
        System.out.println(sq);
    }
}
