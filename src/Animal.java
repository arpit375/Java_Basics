public class Animal implements Eats,Speaks {
    @Override
    public void eats() {
        System.out.println("Animal does eat");
    }

    @Override
    public void speaks() {
        System.out.println("Animal does speaks");
    }
}
