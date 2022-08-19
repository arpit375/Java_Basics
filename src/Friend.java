public class Friend {
    String name;
    static int noOfFriend;

    Friend(String name)
    {
        this.name=name;
        noOfFriend++;
    }

    static void display()
    {
        System.out.println("You have "+noOfFriend+" friends");
    }
}
