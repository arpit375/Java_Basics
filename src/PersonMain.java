public class PersonMain {
    public static void main(String[] args) {
        Hero h1= new Hero("Batman", 40,"Intelligence","Fear to be the good guy");
        Hero h2= new Hero("Superman", 52,"Flying and laser eyes","Kryptonite");

        System.out.println(h1.toString());
        System.out.println(h2.toString());

        h1.walk();
    }
}
