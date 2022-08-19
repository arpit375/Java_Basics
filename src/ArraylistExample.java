import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String args[])
    {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Chicken");
        food.add("Soup");
        food.add("Mutton");
        System.out.println("contents of food are as below:");
        System.out.println(food);

        food.set(0,"Chilly chicken");
        food.remove(1);

        for(int i=0;i<food.size();i++)
        {
            System.out.println(food.get(i));
        }

        food.clear();
        for(int i=0;i<food.size();i++)
        {
            System.out.println(food.get(i));
        }
        System.out.println("now array list is empty");

    }
}
