import java.util.Locale;

public class StringMethods {
    public static void main(String args[])
    {
        String name = "    Arpit   Srivastava    ";

//        boolean result = name.equalsIgnoreCase("arpits");
//        int result = name.length();
//        int result = name.indexOf("i")+1;
//        char result = name.charAt(0);
//        String result = name.toUpperCase();
//        String result = name.trim();
        String result = name.replace('a','k');
        System.out.println(result);
    }
}
