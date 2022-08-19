import java.util.Scanner;

public class PolymorphismInterfaces {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();

        Animal[] animal= {cat,dog,mouse};           // polymorphism

//        for(Animal i: animal){
//            i.eats();                               // traversing function calls through interfaces in Cat,Dog and Mouse
//            i.speaks();                             //  shows static polymorphism
//        }

        System.out.println("Enter the animal choice");
        System.out.println("1:Cat\t2:Dog\t3:Mouse");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if(c==1)
        {
            cat.eats();                     // dynamic polymorphism
            cat.speaks();
        }
        if(c==2)
        {
            dog.eats();
            dog.speaks();
        }
        if(c==3)
        {
            mouse.eats();
            mouse.speaks();
        }
        else
        {
            System.out.println("Invalid choice entered, please enter choice between 1 to 3 only");
        }

    }
}
