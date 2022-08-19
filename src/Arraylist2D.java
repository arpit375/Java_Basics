import java.util.*;

public class Arraylist2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> shop = new ArrayList(); // declaration and list of 2D array list(list of multiple lists)

        ArrayList<String> laptop = new ArrayList<String>();
        laptop.add("HP");
        laptop.add("Lenovo");
        laptop.add("Apple");
        laptop.add("Asus");

        ArrayList<String> mobile = new ArrayList<String>();
        mobile.add("Motorola");
        mobile.add("Samsung");
        mobile.add("Apple");
        mobile.add("Nokia");

        ArrayList<String> isp = new ArrayList<String>();
        isp.add("Verizon");
        isp.add("AT&T");
        isp.add("T-mobile");
        isp.add("Mint");

        // adding laptop, mobile and isp lists to shopping list

        shop.add(laptop);
        shop.add(mobile);
        shop.add(isp);

        System.out.println(shop.get(2));
        System.out.println(shop.get(2).get(2));
    }
}
