public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("Maruti","Sedan",2010);
        Car c2 = new Car("Toyota","SUV",2014);

        System.out.println("Copy constructor called");
        Car c4 = new Car(c1);
        System.out.println(c4.getBrand());
        System.out.println(c4.getModel());
        System.out.println(c4.getYear());

        System.out.println(c1.getBrand());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
        System.out.println(c2.getBrand());
        c2.setBrand("Honda");               // changed the brand
        System.out.println(c2.getBrand());
        System.out.println("Copy car object c1 to c2");
        c1.copy(c2);
        System.out.println(c1.getBrand());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
        System.out.println("Copy constructor called");
        Car c3 = new Car(c1);
        System.out.println(c3.getBrand());
        System.out.println(c3.getModel());
        System.out.println(c3.getYear());
    }
}
