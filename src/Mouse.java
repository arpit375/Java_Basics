public class Mouse extends Animal implements Speaks {
    @Override
    public void speaks() {
        System.out.println("Mouse speaks 'squeak'");
    }

    @Override
    public void eats()  {
        System.out.println("Mouse eats cheese");
    }

}
