import java.util.Scanner;

public class HumanMainCall {
    public static void main(String[] args) {
        Human h1 = new Human("Arpit",29,75.55);
        System.out.println(h1.name+" "+h1.age+" "+h1.weight);
        Human h2 = new Human("Anshul",30);
        System.out.println(h2.name+" "+h2.age);
//        System.out.println("please enter the show size for "+h2.name);
//        Scanner sc = new Scanner(System.in);
//        double shoe_size= sc.nextDouble();
//        h2.know_about(shoe_size);               // function call
//        System.out.println(h1.toString());      // calling overridden toString method
//        Human h[] = new Human[3];           // array of objects declared
//        Human h3 = new Human("Arpit");      // array of objects assigned to name data member
//        Human h4 = new Human("Harshit");
//        Human h5 = new Human("Vaibhav");
//
//        Human[] h= {h3,h4,h5};  // array of objects declared

//        h[0]=h3;
//        h[1]=h4;        // object assigned to array of objects
//        h[2]=h5;

//        System.out.println(h[0].name);
//        System.out.println(h[1].name);
//        System.out.println(h[2].name);
        Profession p = new Profession("engineer");

        Human h6 = new Human("Arpit");
        p.worksAt(h6);
    }
}
