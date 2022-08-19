import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        Hashtable<Integer,String> h = new Hashtable<>();
        h.put(1,"Laptop");
        h.put(2,"mobile");
        h.put(3,"tablet");
        System.out.println(h.toString());
    }
}
