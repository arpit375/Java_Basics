public class Dog extends Animal implements Eats,Speaks {
    @Override
    public void eats() {
        System.out.println("Dog eats bone");
    }

    @Override
    public void speaks() {
        System.out.println("Dog speaks 'bark'");

    }
}
