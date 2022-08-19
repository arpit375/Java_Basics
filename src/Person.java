public abstract class Person { // declaring class as abstract, you cannot instantiate it
    String name;
    int age;
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return this.name+" hero has age of "+this.age+" years old ";
    }
    abstract void walk(); // declaring method as abstract, you cannot implement/has no body in it, can be defined in child class
}
