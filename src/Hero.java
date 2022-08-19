public class Hero extends Person{
    String power;
    String weakness;

    Hero(String name, int age,String power, String weakness)
    {
        super(name, age); // super calling name and age from Person Class
        this.power=power;
        this.weakness=weakness;
    }

    @Override
    public String toString() { // super calling toString() from Person Class
        return super.toString()+power+" as power and "+weakness+" as his weakness" ;
    }

    @Override
    void walk() {
        System.out.println("All heroes walk, some heroes fly as well");
    }
}
