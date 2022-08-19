public class Static {
    public static void main(String[] args) {
        System.out.println(Friend.noOfFriend); // calling directly do not need to create object of class having static variable
        Friend f1 = new Friend("Anas");
//        System.out.println(Friend.noOfFriend);
        Friend f2 = new Friend("Anshul");
        Friend.display(); //  calling directly display method from Friend class
    }
}
