public class Human {
        String name;    // data variables, they are global variables
        int age;
        double weight;

        Human(String name){
            this.name=name;
        }

        Human() {}      // default Constructor

        Human(String name,int age,double weight) // Parameterized Constructor
        {
            this.name=name;
            this.age=age;
            this.weight=weight;
        }

        Human(String name, int age)
        {
            this.name=name;
            this.age=age;
        }

        void know_about(double s)
        {
            System.out.println("the shoe size for "+name+" is "+s);
        }

        public String toString()        // override toString method
        {
            String obj= name+" is name\t"+age+" is age\t"+weight+" is weight"; // concatenation of string, int and double
            // into single string for object
            return obj;
        }
}
