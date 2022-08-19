public class Cat extends Animal implements Eats,Speaks{
    @Override
    public void eats() {
        System.out.println("Cat eats mouse");
    }

    @Override
    public void speaks() {
        System.out.println("Cat speaks 'meow'");

    }
}
